package com.banyuan.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 2:10 下午
 */

public class TestAnnotation3 extends  MyAnnoSon {
  //此类继承了show方法
  public static void main(String[] args) {
    MyAnnotation3  myAnnotation3=MyAnnoSon.class.getDeclaredAnnotation(MyAnnotation3.class);
    System.out.println(myAnnotation3.name());
  }
}
