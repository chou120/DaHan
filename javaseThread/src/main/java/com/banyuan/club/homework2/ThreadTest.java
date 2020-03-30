package com.banyuan.club.homework2;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.tools.Tool;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 9:08 上午
 */
public class ThreadTest {

  /*
  有四个线程,其中A,B线程对i加1操作，C,D线程每次对i减1操作
    A  B       C   D               i=0
     同时启动
     C或者D  i--
     C或者D  i--;

     到加线程
      A  B  i++
      B  A  i++


      加线程抢到了
          A B 谁先执行

      减线程执行
          C  D 谁先执行
  */


  public static void main(String[] args) {
    Tools  tools=new Tools();
    AddThread  addThread1=new AddThread(tools);

    DelThread  delThread2=new DelThread(tools);

    Thread t1=new Thread(addThread1, "线程A");
    Thread t2=new Thread(addThread1, "线程B");
    Thread t3=new Thread(delThread2, "线程C");
    Thread t4=new Thread(delThread2, "线程D");


    t1.start();
    t2.start();
    t3.start();
    t4.start();


  }


}
