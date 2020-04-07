package com.banyuan.dateAPI;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/7 11:36 上午
 */
public interface MyInterface {
  default String getName(){
    return "呵呵呵";
  }

  public static void show(){
    System.out.println("接口中的静态方法");
  }
}
