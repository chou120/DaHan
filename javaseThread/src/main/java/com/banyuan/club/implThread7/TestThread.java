package com.banyuan.club.implThread7;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 11:42 上午
 */
public class TestThread {


  public static void main(String[] args) {
      MyThread2  myThread2=new MyThread2();
      //MyThread3  myThread3=new MyThread3();

      Thread  t1=new Thread(myThread2,"特朗普");
      Thread  t2=new Thread(myThread2,"希拉里");
      t1.start();
      t2.start();
      /*

        1.使用信号量的方式Semaphore
        2.给不同的线程传递锁的时候按顺序传递

       */



  }

}
