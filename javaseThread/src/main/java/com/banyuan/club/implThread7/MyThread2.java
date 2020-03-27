package com.banyuan.club.implThread7;

import java.util.concurrent.TimeUnit;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 11:41 上午
 */
public class MyThread2 implements Runnable {

  @Override
  public void run() {
    while (true) {
      try {
        // 只允许一个线程通过
        if (DieLock.a1.tryAcquire(1, TimeUnit.MILLISECONDS)) {
          System.out.println("-----" + Thread.currentThread().getName() + "有刀了...");
          if (DieLock.a2.tryAcquire(1, TimeUnit.MILLISECONDS)) {
            System.out.println("-----" + Thread.currentThread().getName() + "有叉了...");
            Thread.sleep(2000);
          }
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        DieLock.a1.release();
        DieLock.a2.release();
      }
    }
  }
}
