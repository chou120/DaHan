package com.banyuan.club.implThread5;

import java.util.Hashtable;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 4:23 下午
 */
public class MyThread  implements  Runnable{

  private  int number =50;
  Object   obj=new Object();
  int   x=0;

  @Override
  public void run() {
    while (number>0) {
        if(x%2==0){
            show();
        }else{
            show1();
      }
        x++;
    }
  }
  //静态同步方法的锁是  当前类的class     非静态同步方法锁是 this
  public  synchronized void    show(){  //同步方法  请问同步方法的锁是什么？  this
      if (number > 0) {
        System.out.println(Thread.currentThread().getName() + "卖第" + (number--) + "票");
      }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  public synchronized  void    show1(){
      if (number > 0) {
        System.out.println(Thread.currentThread().getName() + "卖第" + (number--) + "票");
      }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }


}
