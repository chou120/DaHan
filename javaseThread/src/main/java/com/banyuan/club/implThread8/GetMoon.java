package com.banyuan.club.implThread8;

import com.sun.javafx.iio.common.SmoothMinifier;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 2:08 下午
 */
//消费者 消费蛋糕
public class GetMoon  implements  Runnable{

  private   Moon  moon;

  public GetMoon(Moon moon) {
    this.moon = moon;
  }

  @Override
  public void run() {
    while(true) {
      if(moon.flag) {
        System.out.println("蛋糕名叫:" + moon.name + ",蛋糕价格:" + moon.price);
        moon.flag = !moon.flag;
      }
    }
  }
}
