package com.banyuan.club.designer3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 1:42 下午
 */
public class SingleDemo {
  /*
  单例设计模式概述
     什么叫单例模式？
      整个程序只允许一个实例存在

     例子: x.html    xx.asp   计数器

     1.单例对象在对应的类 里面的构造器是私有化的
     2.提供一个静态方法后返回该对象

    单例模式就是要确保类在内存中只有一个对象，该实例必须自动创建，并且对外提供。
    优点
      在系统内存中只存在一个对象，因此可以节约系统资源，对于一些需要频繁创建和销毁的对象单例模式无疑可以提高系统的性能。
    缺点
      没有抽象层，因此扩展很难。
      职责过重，在一定程序上违背了单一职责

    单利设计模式又分为两种:
      1.饿汉模式
      2.懒汉模式  需要的时候再创建

  */
  private static   SingleDemo  singleDemo=new SingleDemo();
    private   SingleDemo(){
    }
    public  static   SingleDemo  getInstance(){
      return singleDemo;
    }
}

class  MyThread2 extends  Thread{
  @Override
  public void run() {
    System.out.println(SingleDemo.getInstance().hashCode());

  }
}



class  Test{

  public static void main(String[] args) {

//    System.out.println(SingleDemo.getInstance().hashCode());
//    System.out.println(SingleDemo.getInstance().hashCode());


    MyThread2 myThread1=new MyThread2();
    MyThread2 myThread2=new MyThread2();
    myThread1.start();
    myThread2.start();
  }
}

