package com.banyuan.tcp;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/1 3:08 下午
 */
public class Received {

  //如果服务器端给客户端反馈 那么容易出现下面问题: 客户端连接上服务端，两端都在等待，没有任何数据传输。
  //导致  Socket is closed

  public static void main(String[] args) throws IOException {

    ServerSocket  serverSocket=new ServerSocket(1234);

    Socket s = serverSocket.accept();
    String ip = s.getInetAddress().getHostAddress();
    System.out.println(ip + "...connected");

    BufferedReader br = new BufferedReader(new InputStreamReader(
        s.getInputStream()));
    PrintWriter pw = new PrintWriter(new FileWriter("server.txt"), true);
    String line = null;
    while ((line = br.readLine()) != null) {
      // if ("over".equals(line)) {
      // break;
      // }
      pw.println(line);
    }

    PrintWriter out = new PrintWriter(s.getOutputStream(), true);
    out.println("上传成功");

    pw.close();
    s.close();
    serverSocket.close();


  }

}
