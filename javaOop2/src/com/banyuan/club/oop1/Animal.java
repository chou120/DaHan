package com.banyuan.club.oop1;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 2:05 下午
 */
public class Animal {

  public  void  eat(){
    System.out.println("动物在进食...");
  }

  public  void  run(){
    System.out.println("动物在运动....");
  }

}
class  Dog extends Animal{
  public  void  eat(){   //每个动物的功能不一样 发生了方法重写
    System.out.println("狗在吃骨头...");
  }

  public  void  run(){
    System.out.println("狗在跑步....");
  }
}
class  Cat extends Animal{
  public  void  eat(){   //每个动物的功能不一样 发生了方法重写
    System.out.println("猫在吃鱼...");
  }
  public  void  run(){
    System.out.println("猫在爬树....");
  }
}
class  Pig extends Animal{
  public  void  eat(){   //每个动物的功能不一样 发生了方法重写
    System.out.println("猪在吃大白菜...");
  }

  public  void  run(){
    System.out.println("猪在走模特步...");
  }
}








