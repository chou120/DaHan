package com.banyuan.club.implThread3;

import java.util.Date;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 3:16 下午
 */
public class MyThread  implements   Runnable{

  //实现多线程的第二种方式  实现Runnable接口

  @Override
  public void run() {
    System.out.println("start....."+new Date());
    for (int  i=0;i<20;i++){
      System.out.println(Thread.currentThread().getName()+"---->>>>"+i);
      try {

        Thread.sleep(1000);

      } catch (InterruptedException e) {

        e.printStackTrace();

        System.out.println("线程抛了异常....");
      }
    }
    System.out.println("end....."+new Date());

  }


}
