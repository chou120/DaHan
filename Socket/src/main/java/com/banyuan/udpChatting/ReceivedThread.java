package com.banyuan.udpChatting;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/1 2:12 下午
 */
public class ReceivedThread implements Runnable {

  private DatagramSocket datagramSocket;

  public ReceivedThread(DatagramSocket datagramSocket) {
    this.datagramSocket = datagramSocket;
  }
  @Override
  public void run() {

    DatagramPacket datagramPacket=null;
    while(true){

      byte[] by=new byte[1024];

      datagramPacket=new DatagramPacket(by,20);

      try {
        datagramSocket.receive(datagramPacket);

        by=datagramPacket.getData();

        int length=datagramPacket.getLength();

        String  st=new String(by,0,length);
        if(st.equals("886")){
          System.out.println("拜拜...");
          break;
        }
        String  name=datagramPacket.getAddress().getHostName();
        System.out.println("发送者:"+name+",接收端的数据为:"+st);

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    datagramSocket.close();
  }



}
