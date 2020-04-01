package com.banyuan.socketDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/1 1:45 下午
 */
public class ReceivedSocket {

  /*
  1:建立udp的socket服务.
    2:通过receive方法接收数据
    3:将收到的数据存储到数据包对象中
    4:通过数据包对象的功能来完成对接收到数据进行解析.
    5:可以对资源进行关闭
   */

  public static void main(String[] args) throws IOException {
    //接收端
    DatagramSocket  datagramSocket=new DatagramSocket(6789);  //设置接收端的端口号

    byte[] by=new byte[20];

    DatagramPacket  datagramPacket=new DatagramPacket(by,20);

    datagramSocket.receive(datagramPacket);

    by=datagramPacket.getData();
    int length=datagramPacket.getLength();

   // InetAddress  inetAddress= datagramPacket.getAddress();

    System.out.println(length+"接收端的数据为:"+new String(by,0,length));

    datagramSocket.close();
  }

}
