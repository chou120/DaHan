package com.banyuan.annotation;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 1:38 下午
 */
//@MyAnnotation
public class Demo1 {

  private  String  name;

  //@MyAnnotation
  public Demo1() {

  }

  //@MyAnnotation
  public static void main(String[] args) {

  }

  //@MyAnnotation(name ="半圆", address ="南京市栖霞区...", age =3)
  //@MyAnnotation(name = "半圆",address = "王五",age = 2)
  @MyAnnotation(value = {"ahahshs","你好"},name = "王五")  //如果注解里面只有value那么 在此就可以不用写 value="" 可以直接赋值
  public static  void show(){


  }

}
