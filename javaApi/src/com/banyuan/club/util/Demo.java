package com.banyuan.club.util;

import org.omg.PortableInterceptor.Interceptor;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/17 1:58 下午
 */
public class Demo {

  //为什么要学自动装箱和自动拆箱   使用包装类方便在任意数据类型之间进行数据类型的切换操作
  public static void main(String[] args) {
    String str = "313";

    int number = 213;   // int  包装类   Integer
    //求两个数据相加的和 ? 请问 你们怎么做


    //自动装箱操作
    // Integer  in=Integer.valueOf(str);  //对字符串进行拆箱操作
     int  num1=Integer.parseInt(str);  //这个方法直接就完成了 自动装箱和拆箱的操作

    //把数据进行包装
    Integer inter = new Integer(str);  //把 String类型的数据包装成 Integer
    int num = inter.intValue();  //把Integer 类型拆箱   拆成 int类型

    num=inter+number;  //自动拆箱操作

    System.out.println(num + number);

    /*
      包装类:    Integer     Double   Float    Byte   Short    Boolean    Long   Character
      基本数据类型:int        double   float    byte    short    boolean   long     char

      问题:  请问  int  和 Integer  有什么区别？
          int 属于基本数据类型   成员变量的int 的默认值为 0
          Integer  属于int包装类 有默认值  null

     */
    boolean   flag=Character.isDigit('2'); //判断这个字符是否是数字
    int   result=Character.compare('f', 'b'); // 两个字符如果相等就为0

    System.out.println(Character.isUpperCase('F'));

    System.out.println(Character.toUpperCase('a'));


  }


}
