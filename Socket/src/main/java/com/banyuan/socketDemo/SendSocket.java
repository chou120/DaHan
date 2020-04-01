package com.banyuan.socketDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/1 1:38 下午
 */
public class SendSocket {

  /*
  1:建立udp的socket服务
  2:将要发送的数据封装成数据包
  3:通过udp的socket服务,将数据包发送出
  4:关闭资源
   */

  public static void main(String[] args) throws IOException {

    DatagramSocket   datagramSocket=new DatagramSocket();
    //第一个参数是要发送的数据 第二个参数是发送数据的长度 第三参数是找到目标地址 第四个参数是找到目标的端口号
    byte [] by="大保健".getBytes();
    //发送的地址
    InetAddress  ip=InetAddress.getLocalHost();
    DatagramPacket   datagramPacket=new DatagramPacket(by,by.length,ip,6789);

    datagramSocket.send(datagramPacket);
    datagramSocket.close();

  }
}
