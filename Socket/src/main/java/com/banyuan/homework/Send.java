package com.banyuan.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 9:32 上午
 */
public class Send {
  //客户端键盘录入，服务器输出文本文件
  public static void main(String[] args) throws IOException {
    Socket  socket=new Socket(InetAddress.getLocalHost().getHostAddress(), 5566);
    OutputStream  os=socket.getOutputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

    System.out.println("请输入数据:");
    String str=br.readLine();

    os.write(str.getBytes());

    os.close();


  }


}
