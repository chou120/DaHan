package com.banyuan.homework6;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 10:14 上午
 */
public class ServerReceived implements Runnable {

  private ServerSocket serverSocket;

  public ServerReceived(ServerSocket serverSocket) {
    this.serverSocket = serverSocket;
  }

  @Override
  public void run() {
    Socket s = null;
    try {
      s = serverSocket.accept();
    } catch (IOException e) {
      e.printStackTrace();
    }
    InputStream is=null;
    String ip=serverSocket.getInetAddress().getHostAddress();

      while (true) {
        try {
          is= s.getInputStream();
          byte[] by = new byte[1024];
          int len = is.read(by, 0, by.length);
          String str = new String(by, 0, len);
          System.out.println(s.getRemoteSocketAddress() + "说:" + str);

        } catch (IOException e) {
          e.printStackTrace();
        }

    }


  }
}
