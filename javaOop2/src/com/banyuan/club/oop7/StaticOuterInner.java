package com.banyuan.club.oop7;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 1:49 下午
 */
public class StaticOuterInner {


  public static  class Inner{

    public   void  showTest(){
      System.out.println("你好,我是静态内部类的showTest方法..."+password);
    }

    public   static  void  run(){
      System.out.println("我是静态内部类的静态方法run..."+password);
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
