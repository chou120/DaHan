package com.banyuan.homework4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

    File file=new  File("liu.jpeg");
    OutputStream  os=new FileOutputStream(file);
    InputStream in=s.getInputStream();
    int len=-1;  //in.read()登不等于-1是判断有没有读到数据的方式
    byte [] bytes=new byte[1];
    while(((len=in.read(bytes))!=-1)){
      os.write(bytes, 0, len);
    }
    os.close();
    in.close();

  }

}
