package com.banyuan.club.oop7;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 1:36 下午
 */
public class InnerClass {
  /*  内部类:


   */

  class Inner{  //成员内部类  成员内部类里面不能包含静态的属性和方法
    private   String  name;
    private   int age;
    public  void  show(){
      System.out.println("我是内部类的show方法..."+password);

      showInfo();

      method();
    }

  }

  private  String   address;

  private static String   password;


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public  void   showInfo(){
    System.out.println("我是外部类的showInfo方法...");
  }

  public   static void  method(){
    System.out.println("我是外部类的静态method方法...");

  }




}
