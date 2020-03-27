package com.banyuan.club.homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 9:14 上午
 */
public class MyThread implements   Runnable{

  private  int number=200;

  @Override
  public void run() {
    while(true){
      synchronized (this){
        if(number%2!=0&& number<=400){
          System.out.println(Thread.currentThread().getName()+"取到奇数"+number);
        }
        if(number>400){
          break;
        }
        number+=1;
      }
      try {
        Thread.currentThread().sleep(20);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    }

}
class TestThread{

  public static void main(String[] args) {
    Runnable r=new MyThread();
    Thread t1=new Thread(r);
    Thread t2=new Thread(r);
    Thread t3=new Thread(r);
    t1.setName("线程1");
    t2.setName("线程2");
    t3.setName("线程3");
    t1.start();
    t2.start();
    t3.start();


  }
}