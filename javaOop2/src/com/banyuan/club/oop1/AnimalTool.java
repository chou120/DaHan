package com.banyuan.club.oop1;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 2:10 下午
 */
public class AnimalTool {


  /*
     多态的好处:
        a.提高了代码的维护性(继承的好处也同时是多态的好处)
        b.提高了代码的扩展性(多态本身的好处)
   */

  //动物的工具类   提供动物特性功能

//  public  static   void useCat(Cat   cat){
//        cat.eat();
//        cat.run();
//  }
//  public  static   void usePig(Pig   pig){
//    pig.eat();
//    pig.run();
//  }
//  public  static   void useDog(Dog   dog){
//    dog.eat();
//    dog.run();
//  }

  //上述方法升级之后   new   Cat()  0x10001
  public   static  void  useAnimal(Animal  animal){  //接收的是 继承了此类的子类的对象,包括本身对象
   if(animal instanceof Cat ){
     System.out.println("我是Cat");
   }

    animal.run();
    animal.eat();
  }

  // 如果子类有的方法  父类没有子类特有的方法  那么请问父类如何访问


}
