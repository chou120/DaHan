package com.banyuan.socketDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/1 10:57 上午
 */
public class Demo1 {

  /*
      什么是网络编程？ 计算机网络
      计算机网络
		    是指将地理位置不同的具有独立功能的多台计算机及其外部设备，通过通信线路连接起来，在网络操作系统，
		    网络管理软件及网络通信协议的管理和协调下，实现资源共享和信息传递的计算机系统。
      网络编程
		    就是用来实现网络互连的不同计算机上运行的程序间可以进行数据交换

		   计算机之间如何进行数据交换的？
		   A                            B
		            C(此种不适用大众)
        开发出一套能被大众公用一种模型
        OSI（Open System Interconnection开放系统互连）参考模型
		    TCP/IP参考模型

   */

  public static void main(String[] args) throws UnknownHostException {
    InetAddress ip = InetAddress.getByName(InetAddress.getLocalHost().getHostAddress());

    System.out.println("ip:"+ip);
    InetAddress inetAddress = InetAddress.getLocalHost();
    System.out.println(inetAddress.getHostName() + "--" + inetAddress.getHostAddress());






  }
}