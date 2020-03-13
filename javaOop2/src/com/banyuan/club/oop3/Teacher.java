package com.banyuan.club.oop3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 3:23 下午
 */
public class Teacher extends   Person {

  public  void  eat(){
    System.out.println("Teacher在吃饭....");
  }

  public  void  sleep(){
    System.out.println("Teacher在睡觉....");
  }

  public  void  drink(){
    System.out.println("Teacher在喝酒....");
  }


  @Override
  public String eat(int num) {
    return null;
  }

  @Override
  public void sleep(Student student) {

  }

  @Override
  public void drink(int[] num) {

  }
}
