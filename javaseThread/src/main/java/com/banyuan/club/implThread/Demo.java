package com.banyuan.club.implThread;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 1:46 下午
 */
public class Demo {
  //实现多线程方式1  1.继承Thread

  public static void main(String[] args) {
    //main启动就相当于一个进程启动zaa

   /* MyThread myThread = new MyThread("线程A");  //线程对象1
    //myThread.run();  线程的启动不是直接调用run  直接调用跟普通调用没什么区别
    myThread.start();*/  //表示启动一个线程  剩下的靠线程的特性来执行

   /* MyThread myThread2 = new MyThread("线程B"); //线程对象2
    myThread2.start();*/

//    MyThread myThread3 = new MyThread(); //线程对象3
//    myThread3.start();
//
//    MyThread myThread4 = new MyThread(); //线程对象4
//    myThread4.start();

    //现在在某一个时间段 抢占相同的执行权
    // System.out.println(Thread.currentThread().getName());

    //run 方法和start方法区别
    /*
        run 被线程对象调用那么就是一个普通方法
        start 被线程对象调用  start 会默认的 （JVM）去调用 run()方法
     */

    MyThread myThread2 = new MyThread("线程B");
    //myThread2.start();//相同的线程不能被重新启动

    MyThread myThread1 = new MyThread("线程A");

    //设置线程执行的优先级    优先级 指的是线程再某一个时间片段内有优先级一说

    MyThread myThread4 = new MyThread("线程D");

    MyThread myThread3 = new MyThread("线程C");


    myThread1.setPriority(9);
    myThread2.setPriority(1);
    myThread3.setPriority(4);
    myThread4.setPriority(7);

    //设计优先级没什么太大效果
    /*
        线程的调度模式:  分时调度  和 抢占式调度
     */





    myThread3.start();
    myThread4.start();
    myThread1.start();
    myThread2.start();

  }
}
