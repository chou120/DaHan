package com.banyuan.club.implThead10;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 3:33 下午
 */
public class MyThread  implements  Runnable{
  @Override
  public void run() {
    synchronized (this){
      System.out.println(Thread.currentThread().getName()+"进啦了....");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      try {
        this.wait();  //等待中 锁释放...
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName()+"有么有执行到这步....");

    }
  }
}
