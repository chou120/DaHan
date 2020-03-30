package com.banyuan.club.designer2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 1:37 下午
 */
public class DogFactory  implements  AnimalFactory {


  @Override
  public Animal createAnimal() {

    return new  Dog();
  }
}
