package com.banyuan.club.designer3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 1:50 下午
 */
public class LazySingle {

  /*
      懒汉模式是线程不安全的
   */

  private static  LazySingle  lazySingle=null;

  private  LazySingle(){

  }

  public static    LazySingle getInstance() {   //也可以使用同步方法

    if (lazySingle == null) {
      synchronized (LazySingle.class) {
        if (lazySingle == null) {   //可以使双重判断解决懒汉模式线程安全问题
          lazySingle = new LazySingle();

        }
      }
      }
      return lazySingle;
    }

}

class  MyThread extends  Thread{

  @Override
  public void run() {
    System.out.println(LazySingle.getInstance().hashCode());

  }
}
class  Test1{
  public static void main(String[] args) {

   // System.out.println(LazySingle.getInstance().hashCode());

   // System.out.println(LazySingle.getInstance().hashCode());

    MyThread myThread1=new MyThread();
    MyThread myThread2=new MyThread();
    myThread1.start();
    myThread2.start();



  }
}