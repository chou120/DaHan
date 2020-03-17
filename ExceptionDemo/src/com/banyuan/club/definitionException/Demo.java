package com.banyuan.club.definitionException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/17 4:01 下午
 */
public class Demo {

  public static void main(String[] args) throws MyException {

      checkScore(-10);

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

   */



}
