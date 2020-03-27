package com.banyuan.club.implThead10;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 3:36 下午
 */
public class TestNotifyAll {

  public static void main(String[] args) {

    MyThread  myThread=new MyThread();

    Thread  t1=new Thread(myThread,"线程1");
    Thread  t2=new Thread(myThread,"线程2");
    Thread  t3=new Thread(myThread,"线程3");
    t1.start();
    t2.start();
    t3.start();

    try {
      System.out.println(Thread.currentThread().getName()+"在休眠...");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    MyThread2  myThread2=new MyThread2("唤醒线程",myThread);
    myThread2.start();






  }


}
