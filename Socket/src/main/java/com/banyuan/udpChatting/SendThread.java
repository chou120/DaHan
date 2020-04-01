package com.banyuan.udpChatting;

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
 * @date 2020/4/1 2:11 下午
 */
public class SendThread  {

  public static void main(String[] args) throws SocketException {
    DatagramSocket  datagramSocket=new DatagramSocket();
    Scanner scanner=new Scanner(System.in);

    while(true) {
      System.out.println("请输入数据:");
      String str = scanner.nextLine();

      byte[] by = str.getBytes();
      //发送的地址
      InetAddress ip = null;
      try {
        ip = InetAddress.getLocalHost();
        DatagramPacket datagramPacket = new DatagramPacket(by, by.length, ip, 12345);
        datagramSocket.send(datagramPacket);

        if(str.equals("886")){
          break;
        }

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    datagramSocket.close();
  }



}
