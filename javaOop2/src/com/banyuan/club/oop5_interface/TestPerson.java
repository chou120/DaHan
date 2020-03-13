package com.banyuan.club.oop5_interface;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 10:32 上午
 */
public class TestPerson {

  public static void main(String[] args) {
    Function  function=new Person();
    boolean   flag=function.login("张三", "123456");
    System.out.println(flag);
  }

}
