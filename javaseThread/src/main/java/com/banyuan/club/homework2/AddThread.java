package com.banyuan.club.homework2;

import java.util.concurrent.CountDownLatch;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 9:36 上午
 */
public class AddThread implements  Runnable {

  Tools  tools;

  public AddThread(Tools tools) {
    this.tools = tools;
  }

  @Override
  public void run() {
  while(true) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    synchronized (tools) {
      if(tools.flag){
        if(tools.countDownLatch.getCount()>0){  //表示线程计数器的个数
          tools.i++;
          System.out.println(Thread.currentThread().getName() + "执行了++" + tools.i);
          tools.countDownLatch.countDown();//使用一次就见一个计数器

        }else{
          try {
            tools.countDownLatch.await();
            tools.countDownLatch=new CountDownLatch(2);
            tools.flag=false;

          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }

      }

    }

  }
  }

}
