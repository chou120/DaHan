package com.banyuan.homework6;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 10:28 上午
 */
public class ServerTest {

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket=new ServerSocket(5566);
    ServerReceived  server=new ServerReceived(serverSocket);
    Thread  t=new Thread(server);
    Thread  t1=new Thread(server);
    Thread  t2=new Thread(server);

    t.start();
    t1.start();
    t2.start();

  }

}
