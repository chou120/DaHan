package com.banyuan.club.oop3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 3:24 下午
 */
public class Student  extends  Person {
  public  void  eat(){
    System.out.println("Student在吃饭....");
  }

  public  void  sleep(){
    System.out.println("Student在睡觉....");
  }

  public  void  drink(){
    System.out.println("Student在喝酒....");
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
