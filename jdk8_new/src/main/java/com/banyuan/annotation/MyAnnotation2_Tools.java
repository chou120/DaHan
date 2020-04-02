package com.banyuan.annotation;

import java.lang.reflect.Method;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 1:59 下午
 */
public class MyAnnotation2_Tools {

  @MyAnnotation2(name = "王淼",address = "中国")
  public void  show(){
    System.out.println("hahahs...");
  }

}



class Test{

  public static void main(String[] args) {

    try {
      Method method=MyAnnotation2_Tools.class.getMethod("show");
      MyAnnotation2  myAnnotation2=method.getAnnotation(MyAnnotation2.class);
      System.out.println(myAnnotation2.name()+"---"+myAnnotation2.address());

    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }


  }
}