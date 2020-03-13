package com.banyuan.club.oop8;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 2:56 下午
 */
//问题3
public class OuterDemo {
  public  int  number=20;
  class InnerDemo{
    public  int  number=40;
    public  void show(){
      int number=60;
      System.out.println();
      System.out.println();
      System.out.println();
    }
  }

}
//求输出结构为:  60  40  20
