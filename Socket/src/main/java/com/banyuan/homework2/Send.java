package com.banyuan.homework2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 9:44 上午
 */

/*
客户端文本文件，服务器输出到控制台
客户端文本文件，服务器输出文本文件
上传图片案例
 */

public class Send {

  public static void main(String[] args) throws IOException {

    Socket socket=new Socket(InetAddress.getLocalHost().getHostAddress(), 5566);
    OutputStream os=socket.getOutputStream();
    File file=new File("server.txt");
    BufferedReader  bufferedReader=new BufferedReader( new FileReader(file));
    String str=bufferedReader.readLine();
    String st="";
    while(str!=null){
      st=st+str;
      str=bufferedReader.readLine();

    }
    os.write(st.getBytes());

    os.close();

  }
}
