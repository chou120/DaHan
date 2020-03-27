package com.banyuan.club.implThread8;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 2:08 下午
 */
//生产者生产蛋糕
public class SetMoon  implements  Runnable {

  private static    int  x=0;

  private  Moon  moon;

  public SetMoon(Moon moon) {
    this.moon = moon;
  }

  @Override
  public void run() {
       while(x<50) {
         if (!moon.flag) {
           if (x % 2 == 0) {
             moon.name = "水果蛋糕";
             moon.price = 50.0;

           } else {
             moon.name = "奶黄蛋糕";
             moon.price = 80.0;
           }
           x++;
           moon.flag = !moon.flag;
         }
       }
  }
}
