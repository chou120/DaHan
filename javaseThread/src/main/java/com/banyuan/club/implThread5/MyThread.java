package com.banyuan.club.implThread5;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 4:23 下午
 */
public class MyThread  implements  Runnable{

  private  int number =50;
  Object   obj=new Object();

  @Override
  public void run() {

    while (true) {
      synchronized (obj) {  //如果实现Runnable接口  锁对象可以是任意一个对象
        if (number > 0) {
          System.out.println(Thread.currentThread().getName() + "卖第" + (number--) + "票");
        } else {
          break;
        }
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }
}
