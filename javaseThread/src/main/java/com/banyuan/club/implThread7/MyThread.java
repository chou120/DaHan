package com.banyuan.club.implThread7;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 11:11 上午
 */
public class MyThread  extends Thread{

  //死锁:    是指两个或者两个以上的线程在执行的过程中，因争夺资源产生的一种互相等待现象
  //
  // 美国A        中国B
  //        科学家的故事:   化学A -->   o1实体    <--  化学B说 那同等价值的资源跟你换

  //      A刀 刀     B叉  叉
  private  boolean  flag;  //同时执行
  public MyThread(String name,boolean  flag) {
    super(name);
    this.flag=flag;
  }
  @Override
  public void run() {
    //如果张三先进来了 首先要拿到其中一个锁  再拿另一个锁
    //wait();  表示线程等待执行 并且 释放锁

    if(flag){
      synchronized (DieLock.dao){
        System.out.println(Thread.currentThread().getName()+"拿到了刀..");
        synchronized (DieLock.cha){
          System.out.println(Thread.currentThread().getName()+"拿到了叉...");
        }
      }
    }else {
      synchronized (DieLock.cha){
        System.out.println(Thread.currentThread().getName()+"拿到了叉...");

        synchronized (DieLock.dao){
          System.out.println(Thread.currentThread().getName()+"拿到了刀...");
        }
      }
   }
  }
}
class  TestDieLock{

  public static void main(String[] args) {
    MyThread  myThread1=new MyThread("特朗普",true);
    MyThread  myThread2=new MyThread("希拉里",false);

    myThread1.start();
    myThread2.start();

  }
}

//解决死锁问题其实就是解决线程间的通信问题

