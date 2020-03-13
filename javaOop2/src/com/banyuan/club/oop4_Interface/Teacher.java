package com.banyuan.club.oop4_Interface;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 10:03 上午
 */
public class Teacher extends  Person  implements CreateFunction{

  @Override
  public void eat(String foodName) {
    System.out.println("老师在吃"+foodName);
  }

  @Override
  public void sleep() {
    System.out.println("老师在睡觉...");
  }

  //老师有一个研发的功能   额外的功能
  @Override
  public   void  createNew(String   type){
    System.out.println(type+"老师有研发的功能...");
  }


}
