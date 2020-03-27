package com.banyuan.club.implThead10;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 3:35 下午
 */
public class MyThread2  extends  Thread {

  //唤醒线程
  MyThread  myThread;
  public MyThread2(String name,MyThread  myThread) {
    super(name);
    this.myThread=myThread;
  }

  @Override
  public void run() {
    synchronized (myThread){  //唤醒所有的线程指的是唤醒具有同一个对象锁的操作目标对象的所有线程
      myThread.notifyAll();  //唤醒等待   唤醒目标线程
      //myThread.notify();  //如果是多个线程 那么唤醒的是随机一个线程
      System.out.println(Thread.currentThread().getName()+"线程进来了...");
    }
  }
}
