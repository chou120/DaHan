package com.banyuan.club.implThread5;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 4:24 下午
 */
public class TestMyThread {

  public static void main(String[] args) {

    MyThread  myThread=new MyThread();  //只有一个对象

    Thread  t1=new Thread(myThread,"线程A");
    Thread  t2=new Thread(myThread,"线程B");
    Thread  t3=new Thread(myThread,"线程C");
    Thread  t4=new Thread(myThread,"线程D");


    t1.start();
    t2.start();
    t3.start();
    t4.start();

  }

}
