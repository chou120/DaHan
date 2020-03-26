package com.banyuan.club.implThread4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 3:56 下午
 */
public class TestMyThread {


  public static void main(String[] args) {
    MyThread  myThread1=new MyThread("窗口A");
    MyThread  myThread2=new MyThread("窗口B");
    MyThread  myThread3=new MyThread("窗口C");
    MyThread  myThread4=new MyThread("窗口D");

    myThread1.start();
    myThread2.start();
    myThread3.start();
    myThread4.start();

    /*发现的问题  1:买票数太多
                2.重复的票

          目标资源没有统一   50

        如果在 执行过程中使用  线程休眠 那么所卖的票数 就会出现负数

        A  1  ----> number -- =0  B  C  number=1  -1   -2   0

        如何解决上述问题:  资源统一了
                        是多线程环境
                只能在程序执行  给出一个限制  让所有的线程都必须执行这个限制

           synchronized (锁)  同步关键字

    */




  }
}
