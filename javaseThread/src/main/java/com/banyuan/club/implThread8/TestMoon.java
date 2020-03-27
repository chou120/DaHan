package com.banyuan.club.implThread8;

import java.util.Set;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 2:14 下午
 */
public class TestMoon {

  public static void main(String[] args) {
    Moon  moon=new Moon();
    SetMoon  setMoon=new SetMoon(moon);
    GetMoon  getMoon=new GetMoon(moon);

    Thread  t=new   Thread(setMoon);
    Thread  t2=new  Thread(getMoon);

    t.start();
    t2.start();


  }
}
