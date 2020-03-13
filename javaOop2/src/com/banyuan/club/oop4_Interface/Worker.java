package com.banyuan.club.oop4_Interface;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 10:03 上午
 */
public class Worker  extends  Person{

  @Override
  public void eat(String foodName) {
    System.out.println("工人在吃"+foodName);
  }

  @Override
  public void sleep() {
    System.out.println("工人在睡觉...");
  }
}
