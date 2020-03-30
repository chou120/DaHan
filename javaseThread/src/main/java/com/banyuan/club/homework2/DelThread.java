package com.banyuan.club.homework2;

import java.util.concurrent.CountDownLatch;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 9:36 上午
 */
public class DelThread  implements  Runnable {

  Tools  tools;

  public DelThread(Tools tools) {
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
        if(!tools.flag){
          if(tools.countDownLatch.getCount()>0){
            tools.i--;
            System.out.println(Thread.currentThread().getName() + "执行了--" + tools.i);
            tools.countDownLatch.countDown();

          }else{
            try {
              tools.countDownLatch.await();  //线程计数器使用完了就进入等待状态
              tools.countDownLatch=new CountDownLatch(2);  //重新创建两个线程计数器
              tools.flag=true;
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }



}
