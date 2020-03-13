package com.banyuan.club.oop7;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 2:00 下午
 */
public class AnImpl  extends   Animal{

  @Override
  public String getDataByName(String name) {
    name+="真牛逼...";
    return name;
  }

  @Override
  public String getDataByAge(int age) {
    return null;
  }

  @Override
  public String deDataByName(String name) {
    return null;
  }

}
