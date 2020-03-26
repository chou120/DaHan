package com.banyuan.club.implThread2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 1:47 下午
 */
public class MyThread extends  Thread {

  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    //在此方法里面测试  哪个线程先 进来 ...
    //System.out.println(Thread.currentThread().getName()+"线程进来了...");
    for (int i = 0; i < 50; i++) {
      //System.out.println(this.getName()+"------->>>>"+i);

      //A  休眠  1000毫秒
      //B  休眠  1000毫秒

      //B  休眠   1000毫秒
      //A  休眠   1000毫秒

//      try {
//        Thread.currentThread().sleep(1000);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }

      System.out.println(Thread.currentThread().getName()+"------->>>>"+i);



    }
  }
}
