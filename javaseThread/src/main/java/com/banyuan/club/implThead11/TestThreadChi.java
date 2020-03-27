package com.banyuan.club.implThead11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 4:25 下午
 */
public class TestThreadChi {

  public static void main(String[] args) {
    //线程池里的每一个线程代码结束后，并不会死亡，而是再次回到线程池中成为空闲状态，等待下一个对象来使用
    ExecutorService  es=Executors.newCachedThreadPool();
    es.submit(new MyThread());
    es.submit(new MyThread());
    es.submit(new MyThread());
//    es.submit(new MyThread());
//    es.submit(new MyThread());
//    es.submit(new MyThread());
//    es.submit(new MyThread());

    es.shutdown();  //不可以再继续添加线程



    MyThread  myThread1=new MyThread();
    long   start=System.currentTimeMillis();

    //每个线程要消耗1MB内存  开线程的数量  最好跟电脑的核数有关       9  --->>>19     10 --->>>21
    for (int i = 0; i <10000; i++) {
      Thread  t=new Thread(myThread1);
      t.start();
    }
    long   end =System.currentTimeMillis();
    System.out.println(end-start);


  }

}
