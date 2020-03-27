package com.banyuan.club.homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 9:46 上午
 */
public class MyThread2 implements Runnable {


  @Override
  public void run() {
    while (true) {
      synchronized (this) {
        System.out.println(Thread.currentThread().getName() + "进入一线天...");
        Thread.currentThread().stop();
      }
    }
  }
}

class Test {

  public static void main(String[] args) {
    MyThread2 myThread2 = new MyThread2();
    new Thread(myThread2, "线程A").start();
    new Thread(myThread2, "线程B").start();
    new Thread(myThread2, "线程C").start();
    new Thread(myThread2, "线程D").start();
    new Thread(myThread2, "线程E").start();
    new Thread(myThread2, "线程F").start();
    new Thread(myThread2, "线程G").start();
    new Thread(myThread2, "线程H").start();
    new Thread(myThread2, "线程I").start();
    new Thread(myThread2, "线程J").start();


  }
}
