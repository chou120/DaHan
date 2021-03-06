package com.banyuan.club.designer;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 11:25 上午
 */
public abstract class Animal {

  /*
  简单工厂模式概述
    又叫静态工厂方法模式，它定义一个具体的工厂类负责创建一些类的实例
  优点
    客户端不需要在负责对象的创建，从而明确了各个类的职责
  缺点
    这个静态工厂类负责所有对象的创建，如果有新的对象增加，或者某些对象的创建方式不同，就需要不断的修改工厂类，不利于后期的维护
   */
  public  abstract  void  eat();


}
