package com.banyuan.club.implThread9;

import java.util.Set;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 2:31 下午
 */
public class TestMoon {

  public static void main(String[] args) {
    Moon  moon=new Moon();
    SetMoon  setMoon=new SetMoon(moon);
    GetMoon  getMoon=new GetMoon(moon);
    setMoon.start();
    getMoon.start();


  }
}
