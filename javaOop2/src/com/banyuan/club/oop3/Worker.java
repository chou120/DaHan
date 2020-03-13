package com.banyuan.club.oop3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 3:23 下午
 */
public class Worker  extends   Person {

  public  void  eat(){
    System.out.println("Worker在吃饭....");


  }

  public  void  sleep(){
    System.out.println("Worker在睡觉....");
  }

  public  void  drink(){
    System.out.println("Worker在喝酒....");
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
