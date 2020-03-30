package com.banyuan.club.designer2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 1:40 下午
 */
public class Test {

  public static void main(String[] args) {
    AnimalFactory animalFactory = new DogFactory();
    Animal animal = animalFactory.createAnimal();

    animalFactory = new CatFactory();
    animal = animalFactory.createAnimal();

  }

}
