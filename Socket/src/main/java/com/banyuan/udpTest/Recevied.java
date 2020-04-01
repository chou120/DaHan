package com.banyuan.udpTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/1 2:01 下午
 */
public class Recevied {

  public static void main(String[] args) throws IOException {
    //接收端
    DatagramSocket datagramSocket=new DatagramSocket(6789);  //设置接收端的端口号
    DatagramPacket datagramPacket=null;
    while(true){

      byte[] by=new byte[1024];

      datagramPacket=new DatagramPacket(by,20);

      datagramSocket.receive(datagramPacket);

      by=datagramPacket.getData();

      int length=datagramPacket.getLength();

      // InetAddress  inetAddress= datagramPacket.getAddress();
      String  st=new String(by,0,length);
      if(st.equals("886")){
        System.out.println("拜拜...");
        break;
      }
      System.out.println(length+"接收端的数据为:"+st);

    }

    datagramSocket.close();

  }
}

