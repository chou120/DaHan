package com.banyuan.club.oop8;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 2:45 下午
 */
public class A extends  C implements  B{

  @Override
  public void login() { //请问 使用的是哪个 login
    System.out.println("输出.....");
  }
}

interface  B{
  void  login();
}

abstract  class  C {
 public  abstract void   login();
}




//问题
//interface  Inter{
//  void  show();
//}
//
//class  Outer {
//  //请补齐代码
//}
//class TestOuter{
//
//    public static void main(String[] args) {
//          Outer.method().show();
//    }
//  }
//
