package com.banyuan.club.reflectdemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 2:17 下午
 */
public class Person {
  private  String name="张三...";
  public   int  age=12;

  public Person(String name) {
    this.name = name;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private   void  method(){
    System.out.println("我是私有化方法...");
  }
  public  void   show(String  name){
    System.out.println("我是公有化方法..."+name);
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
