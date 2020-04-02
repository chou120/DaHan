package com.banyuan.homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 10:38 上午
 */

//Socket写一个聊天群
public class Send implements Runnable {

  Socket socket ;
  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

  public Send(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {

    while (true) {
      try {
        OutputStream os = socket.getOutputStream();
        System.out.println("请输入数据:");
        String str = bufferedReader.readLine();
        os.write(str.getBytes());
        os.flush();
        if (str.equals("886")) {
          break;
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
}