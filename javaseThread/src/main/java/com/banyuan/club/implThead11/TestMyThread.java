package com.banyuan.club.implThead11;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 3:53 下午
 */
public class TestMyThread {


//  线程组:
//  方便管理线程  可以设置统一的一些属性   比如说 部分线程是守护线程  setDaemon()
//  设置未处理异常的处理方法 设置一些安全策略等等

  public static void main(String[] args) {
    MyThread  myThread1=new MyThread();

    ThreadGroup  t=new ThreadGroup("javaSE");

    Thread thread1=new Thread(t,myThread1,"线程A");
    Thread thread2=new Thread(t,myThread1,"线程B");
    Thread thread3=new Thread(t,myThread1,"线程C");
    Thread thread4=new Thread(t,myThread1,"线程D");
    Thread thread5=new Thread(t,myThread1,"线程E");
    Thread thread6=new Thread(t,myThread1,"线程F");
    Thread thread7=new Thread(t,myThread1,"线程G");

    //t.destroy();  线程组销毁没有线程可以执行
   // t.setDaemon(true);

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    thread5.start();
    thread6.start();
    thread7.start();

    //System.out.println(t.getParent().activeCount());
 //   t.list();
   // t.destroy();
    //System.out.println(t.getParent().activeCount());  //main   垃圾回收
    Thread  [] list=new  Thread[5];
    int  count=t.getParent().enumerate(list);
    System.out.println(count);
    for (Thread  t1:list) {
      System.out.println(t1.getName()+"-----");
    }


  }
}
