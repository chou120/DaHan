package com.banyuan.oop5;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 2:31 下午
 */
public class Teacher {

  public   int   number=300; //非静态的成员是属于对象的
  public  static  int  money=500;  //其中第一个老师 管了班费 500

  public  int   buyCar(int money){
    return  number=number-money;
  }

  public  int  buyFly(int  mon){
    System.out.println("我用班费"+mon);
    return   money=money-mon;
  }



}
