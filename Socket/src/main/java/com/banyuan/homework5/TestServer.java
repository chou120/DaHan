package com.banyuan.homework5;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 10:28 上午
 */
public class TestServer {

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket=new ServerSocket(5566);
    Server  server=new Server(serverSocket);
    Thread  t=new Thread(server);
    t.start();

  }

}
