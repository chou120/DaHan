package com.banyuan.club;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 1:46 下午
 */
public class DuoTaiDemo1 {

  /*
    什么是多态?
       同一个对象,在不同时刻表现出来的不同的状态
    水   液体  固体  气体
    猫   花猫    黑猫   白猫   蓝猫  ...

    多态的前提:
      1.类与类之间要有继承关系
      2.要有方法的重写
              如果没有重写方法？
      3.父类的引用指向子类的对象

   */

  public static void main(String[] args) {



    char  x='B';

    System.out.println(x+3);

    int total = 0;
    for ( int i = 0; i< 4; i++ ){
      if ( i == 1) continue;
      if ( i == 2) break;
      total += i;
    }
    System.out.println(total);


  }




}
