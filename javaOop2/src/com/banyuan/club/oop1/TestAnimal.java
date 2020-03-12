package com.banyuan.club.oop1;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 2:12 下午
 */
public class TestAnimal {

  public static void main(String[] args) {
//    Dog  dog=new Dog();
//    dog.eat();
//    dog.run();
//
//    Cat  cat=new Cat();
//    cat.run();
//    cat.eat();
//
//    Pig  pig  =new Pig();
//    pig.eat();
//    pig.run();


//    Animal    animal=new Dog();
//              animal.eat();
//              animal.run();
//
//              animal=new Cat();
//              animal.eat();
//              animal.run();
//
//              animal=new Pig();
//              animal.eat();
//              animal.run();
//     //
    //可不可以使用一个工具类  把动物的相同的功能都放到一块

//    AnimalTool.useCat(new  Cat()); //使用工具类  传递一个对象
//
//    AnimalTool.useDog(new  Dog());


    //升级之后的测试
      Animal  animal=new Dog();
      AnimalTool.useAnimal(animal);

  }



}
