package com.banyuan.dateAPI;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/7 11:37 上午
 */
public class SubClass implements MyFun, MyInterface {

  @Override
  public String getName() {
    //如果接口里面默认方法重名了,那么使用下面方式指定使用哪个接口里面的默认方法...
    return MyFun.super.getName();
  }
}

class Test {

  public static void main(String[] args) {
    SubClass sc = new SubClass();
    System.out.println(sc.getName());

    MyInterface.show();

  }
}