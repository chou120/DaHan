package com.banyuan.homework;

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
 * @date 2020/4/2 9:32 上午
 */
public class Server {

  public static void main(String[] args) throws IOException {

    File file=new  File("1.txt");
    if(!file.exists()){
      file.createNewFile();
    }

    ServerSocket  serverSocket=new ServerSocket(5566);
    Socket   s=serverSocket.accept();


    InputStream  in=s.getInputStream();

    byte[] bytes=new  byte[1024];
    int len=in.read(bytes);
    String  st=new String(bytes,0,len);

    OutputStream  os=new FileOutputStream(file);
    os.write(st.getBytes());


    os.close();
    in.close();



  }


}
