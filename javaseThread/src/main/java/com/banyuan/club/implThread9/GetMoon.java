package com.banyuan.club.implThread9;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 2:28 下午
 */
public class GetMoon extends Thread {

  private Moon moon;

  public GetMoon(Moon moon) {
    this.moon = moon;
  }

  @Override
  public void run() {
    while (true) {
      //如果生产者没有生产蛋糕  消费者就一直处于等待状态  直到生产者有蛋糕了...
      synchronized (moon) {
        if(!moon.flag){
          try {
            moon.wait();  //消费者线程进入等待状态....
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println("蛋糕名称:" + moon.name + "===,蛋糕价格:" + moon.price);
        moon.notify();//唤醒生产的线程
        moon.flag=false;
      }
    }
  }
}
