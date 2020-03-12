package com.banyuan.club.oop3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 3:22 下午
 */
public abstract class Person {

  /*
    一个类如果是抽象类  那么此类里面不一定有抽象类(抽象类和普通类的区别)
    一个类里面如果有抽象方法  那么这个类一定是抽象类

    抽象类不能被创建对象

    子类创建对象 抽象类的无参构造器被调用  父类的无参构造器被调用是因为子类要使用父类的成员

    抽象类并不能描述一个具体存在

    Person  p=new  Person();  //

    抽象类不能被创建对象(不能被实例化)
        因为它不是具体
          抽象类里面 有构造方法  但是不能实例化   那么构造方法有什么作用呢
            用于子类对父类数据的 初始化以及使用

     抽象类的实例化其实是靠具体的子类实现     -----> 抽象类多态

    抽象类里面可以有抽象方法   也可以有非抽象方法
    成员变量:可以有常量  可以有变量

      abstract 不可以和 final static  private 一起使用

    一个类里面如果没有抽象方法  可不可以定义成抽象类

    抽象类的子类可以是 普通类 也可以是抽象类


   */

  public   abstract String  eat(int  num);

  public abstract void  sleep(Student  student);

  public abstract void  drink(int [] num);

  private   String  address="哈哈哈";

  public    String  name="大保健";

  public   void showInfo(){
    System.out.println("我是抽象类里面的普通方法");
  }

  public  Person(){
    System.out.println("我是父类的无参构造方法....");
  }

  public Person(String address) {
    this.address = address;
  }


  public   static  void  test(){
    System.out.println("我是父类的静态方法.....");
  }


}
