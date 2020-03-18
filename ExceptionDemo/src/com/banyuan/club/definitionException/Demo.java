package com.banyuan.club.definitionException;

import org.junit.Test;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/17 4:01 下午
 */
public class Demo {


  /**
   * 什么叫做断言？ 断言主要用做  测试和开发用的    对于一些关键的数据进行判断
   * 如果条件成立 程序停止
   * 如果条件不成立  继续执行
   *
   */


  @Test
  public   void   show(){
    // System.out.println(1/0);
    System.out.println("as撒大所大所");
  }



  public static void main(String[] args) throws MyException {

      //checkScore(-10);

    int  num=20;
    assert  num==30:"num并不是30";  // java 默认是关闭断言的
    System.out.println(num);

    //现在断言基本上没人用   连jvm停止了   现有一个 junit 测试框架    基本已经占用了assert生存空间




  }


  public static   void   checkScore(int  score) throws MyException {
    //分数只有正的  并且是在一定范围内
    if(score<0 || score>150){
      throw  new  MyException("你的分数有问题....");
    }else {
      System.out.println("是三好生");
    }


  }

  /*
    作业1:throw 和 throws的区别?
     1.前者是手动抛出异常对象,后者是主动抛出异常对象
     2.前者抛出的异常一般是开发人员处理   后者一般是把异常抛给虚拟机

   */

  /*
    A 走在小箱子里面    看见 B 站在 C 旁边   B 满手是血  C浑身是血躺在地上
    A 接下来  要 尖叫  然后说  杀人啦   报警

    B 满脸懵逼  说  人不是我杀得 我来就是这样了....

    警察D来了   由于A看到了 B手上有血 于是与就  跟警察说  B杀人了    A:断言

    D  B有嫌疑    D:如果有证据 A断言是对的  抓起来    A断言不对   放人

     D  计算机      -- B -->   程序继续执行






   */






}
