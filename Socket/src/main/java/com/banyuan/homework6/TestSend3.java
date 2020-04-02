package com.banyuan.homework6;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 11:19 上午
 */
public class TestSend3 {

  public static void main(String[] args) throws IOException {
    Socket  socket=new Socket(InetAddress.getLocalHost().getHostAddress(), 5566);
    Send  send=new Send(socket);
    Thread  t=new Thread(send);
    t.start();

  }

}
