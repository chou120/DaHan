package com.banyuan.club;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/9 上午10:33
 */
public class Demo {//成员变量  成员方法

  // 预习: 什么是类  什么是对象
  //  面向过程   计算机来进行控制
  //  面向对象   从一个 执行者 变成 一个 指挥者   甩手掌柜
  //  一个指令交个xxx 让xxx执行 最终得到结果    中间的过程 我不过问
  //  面向对的使用: 面向对象(oop)就是 java编程语言的核心

  //  成员变量也叫 demo类的一个属性  ---->成员属性
  public int   x=10;
  public String   username="张三";
  public String   address="住在栖霞市紫东创意园B9栋的下水道...";

  //  函数(方法)  叫Demo 行为特征
  public  void   test(){
    System.out.println(x+username);
  }
  public void  show(){
    System.out.println(x+address);
  }


}
