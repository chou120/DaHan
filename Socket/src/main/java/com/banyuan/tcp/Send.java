package com.banyuan.tcp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/1 3:03 下午
 */
public class Send {
  /*
  1:建立客户端的Socket服务,并明确要连接的服务器。

  2:如果连接建立成功,就表明,已经建立了数据传输的通道
  .就可以在该通道通过IO进行数据的读取和写入.该通道称为Socket流,
  Socket流中既有读取流,也有写入流.

  3:通过Socket对象的方法,可以获取这两个流

  4:通过流的对象可以对数据进行传输

  5:如果传输数据完毕,关闭资源
   */

  public static void main(String[] args) throws IOException {

    Socket  socket=new Socket(InetAddress.getLocalHost().getHostAddress(),1234);
    BufferedReader br = new BufferedReader(new FileReader("java.txt"));
    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
    //打印流
    String line = null;
    while ((line = br.readLine()) != null) {
      pw.println(line);
    }

    socket.shutdownOutput();

    // 接收服务器返回
    BufferedReader brIn = new BufferedReader(new InputStreamReader(
        socket.getInputStream()));
    String str = brIn.readLine();
    System.out.println("server:" + str);

    br.close();
    socket.close();


  }
}
