package com.banyuan.tcp2;

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

    while (true){
      Socket  s=serverSocket.accept();
      InputStream   is=s.getInputStream();
      byte[] bytes=new byte[1024];
      int len=is.read(bytes);
      is.close();
      String str=new  String(bytes,0,len);
      System.out.println("接收到数据为:"+str);


      OutputStream  os= s.getOutputStream();
      os.write("服务器端接收到了...".getBytes());
      os.close();


    }

  }

}
