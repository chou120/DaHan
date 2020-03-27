package com.banyuan.club.implThread9;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 2:27 下午
 */
public class SetMoon  extends   Thread {
  private   Moon moon;
  int x=0;
  public SetMoon(Moon moon) {
    this.moon = moon;
  }

  @Override
  public void run() {
    while (true) {
      synchronized (moon) {
        if (moon.flag) {  //生产者如果有蛋糕就等待
          try {
            moon.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }

        if (x % 2 == 0) {
          moon.name = "水果蛋糕";
          moon.price = 56.7;
        } else {
          moon.name = "垃圾蛋糕";
          moon.price = 6.7;
        }
        moon.flag = true;// true
        //把当前对象所在的等待的线程进行唤醒
        moon.notify();//
      }
      x++;
    }
      }

    }






