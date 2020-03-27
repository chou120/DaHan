package com.banyuan.club.implThead11;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 3:53 下午
 */
public class MyThread  implements  Runnable{


  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName()+"---进来了...");
  }
}
