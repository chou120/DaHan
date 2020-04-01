package com.banyuan.udpChatting;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/1 2:18 下午
 */
public class TestChatting {

  public static void main(String[] args) throws SocketException {

    DatagramSocket rds = new DatagramSocket(12345);
    ReceivedThread receivedThread = new ReceivedThread(rds);
    Thread t1 = new Thread(receivedThread);
    t1.start();


  }

}
