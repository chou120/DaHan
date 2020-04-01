package com.banyuan.udpTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/1 1:58 下午
 */
public class Send {

  public static void main(String[] args) throws IOException {
    DatagramSocket datagramSocket=new DatagramSocket();
    //第一个参数是要发送的数据 第二个参数是发送数据的长度 第三参数是找到目标地址 第四个参数是找到目标的端口号
    Scanner  scanner=new Scanner(System.in);
    while(true) {
      System.out.println("请输入数据:");
      String str = scanner.nextLine();

      byte[] by = str.getBytes();
      //发送的地址
      InetAddress ip = InetAddress.getLocalHost();
      DatagramPacket datagramPacket = new DatagramPacket(by, by.length, ip, 6789);
      datagramSocket.send(datagramPacket);

      if(str.equals("886")){
        break;
      }

    }

    datagramSocket.close();
  }

}
