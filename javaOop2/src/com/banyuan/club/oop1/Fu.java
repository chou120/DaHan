package com.banyuan.club.oop1;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 1:51 下午
 */
public class Fu {

  public int num = 10;

  public void show() {
    System.out.println("我是父类的show方法...");
  }

  public static void function() {
    System.out.println("我是父类的静态方法....");
  }
}

class Son extends Fu {

  public int num = 100;
  public int num2 = 200;

  @Override
  public void show() {
    System.out.println("我是子类的show方法...");
  }

  public static void function() {
    System.out.println("我是子类的静态方法....");
  }
}
class TestSon {
  public static void main(String[] args) {
    Fu fu = new Son(); //父类引用指向子类对象
    //Son  son=new Son();
    //   long  可不可以接收int  数据      Son 继承的是  Fu   Fu > Son
    //fu.show();
    Son son = new Son();
    System.out.println(son.num);
    System.out.println(fu.num);  //如果左边是 Fu类类型来接收 那么输出的成员变量就是使用父类的成员变量

    fu.function();
    son.function();


  }
}
