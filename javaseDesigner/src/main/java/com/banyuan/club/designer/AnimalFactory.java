package com.banyuan.club.designer;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 11:28 上午
 */
public class AnimalFactory {

  private AnimalFactory() {}
  //动物工厂用来创建动物对象
  public static   Dog  createDog(){
    return   new  Dog();
  }
  public static   Cat  createCat(){
    return   new  Cat();
  }

  public static   Pig  createPig(){
    return   new  Pig();
  }

  //自己尝试改进
//  public static Animal createAnimal(String animalName) {
//    if(“dog”.equals(animalName)) {}
//		else if(“cat”.equals(animale)) {
//
//    }else {
//      return null;
//    }
//  }





}
