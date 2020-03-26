package com.banyuan.club.implThread2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 2:14 下午
 */
public class Demo {

  public static void main(String[] args) throws InterruptedException {
    MyThread myThread1 = new MyThread("线程A");
    MyThread myThread2 = new MyThread("线程B");
    MyThread myThread3 = new MyThread("线程C");

    myThread1.start();
    // myThread1.join();//后面线程都在等待此线程执行完毕(线程死亡)
    myThread2.start();
    myThread3.start();

//  myThread1.yield();//线程让步
//  myThread2.yield();
//  myThread3.yield();

  }
}
