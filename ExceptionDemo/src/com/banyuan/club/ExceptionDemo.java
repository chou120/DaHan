package com.banyuan.club;

import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/17 3:12 下午
 */
public class ExceptionDemo {

  public static void main(String[] args) {
    //为什么要学习 Exception?
      /*
          100% 错误  出现也是提升自身能力的一种  同时也会提高自己写代码的效率

          1.可以通过修改代码进行错误修复     Exception
              异常又分为两种   运行时异常  和 编译时异常(检查异常)
              数组下标越界   类转换异常   空指针异常等等

          2.系统错误,环境的问题  内容的问题  Error

       */
    //第一次写代码 并且第一次出现错误的时候
//    int [] arr={};
//    System.out.println(arr[0]);//java.lang.ArrayIndexOutOfBoundsException: 0


    //我们怎么去学习它
          //如何去处理异常
    int  []arr={12,512,56,7,23,11,9};

    Scanner  scanner=new Scanner(System.in);
//    System.out.println("请输入第一数据:");
//    int number1=scanner.nextInt();
//    System.out.println("请输入第二数据:");
//    int number2=scanner.nextInt();

    try {

//      int  result=number1/number2; //java.lang.ArithmeticException: / by zero
//      System.out.println("任意两个数相除的商是:"+result);  //当前面报错的时候 后面程序不会在执行

        Person  p=null;

      System.out.println(p.toString());

    }catch (NullPointerException  e){
      //System.err.println("程序出错了,赶紧来修改...");
      e.printStackTrace();
      /*
      java.lang.NullPointerException
	at com.banyuan.club.ExceptionDemo.main(ExceptionDemo.java:46)
       */
      //System.err.println(e.getCause());
    }catch (IndexOutOfBoundsException e){

    }

    /*

        try{

        }catch(){

        }finally{

        }


     */




    for (int i = 0; i <arr.length; i++) {
      System.out.print(arr[i]+"  ");
    }

    //大型的电商网站 如果在某一块显示数据出错  那么该大型网站是不是就崩溃了 不在上线运行  知道修复程序错误？
    /*
      如何去处理程序错误？
      try{
          可能是会出现错误的代码;
      }catch(可能会出现错误的类型   变量名){
          抛出错误信息;
      }

      使用try 捕捉异常 不会影响整个程序运行


     */





    //明确Exception






  }


}
