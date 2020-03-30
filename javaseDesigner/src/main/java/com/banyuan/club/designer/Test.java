package com.banyuan.club.designer;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 11:27 上午
 */
public class Test {

  public static void main(String[] args) {
//    Animal  animal=new Dog();
//    animal.eat();

    Animal  animal=AnimalFactory.createDog();
      animal.eat();

  }

}
