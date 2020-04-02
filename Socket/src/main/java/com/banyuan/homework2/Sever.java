package com.banyuan.homework2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 9:44 上午
 */
public class Sever {

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket=new ServerSocket(5566);
    Socket s=serverSocket.accept();

    InputStream in=s.getInputStream();

    byte[] bytes=new  byte[1024];
    int len=in.read(bytes);
    String  st=new String(bytes,0,len);

    System.out.println("客户端传过来内容为:"+st);
    in.close();

  }

}
