package com.banyuan.club.reflectdemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 2:08 下午
 */
public class Demo1 {

  public   Demo1(String name,int  age){

  }

  public static void main(String[] args) {
    ClassLoader classLoader= ClassLoader.getSystemClassLoader();
    try {
      Class   clazz=classLoader.loadClass("com.banyuan.club.reflectdemo.Demo1");
      //
      System.out.println(clazz.getConstructor(String.class,int.class).getName());


    } catch (ClassNotFoundException | NoSuchMethodException e) {
      e.printStackTrace();
    }
  }

}
