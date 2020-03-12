package com.banyuan.club.oop2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 3:11 下午
 */
public class Student  extends  Person{

  public  void   study(){
    System.out.println("我是子类特有的方法....");
  }

  public  void  show(){
    System.out.println("我是子类重写的方法...");
  }


}
