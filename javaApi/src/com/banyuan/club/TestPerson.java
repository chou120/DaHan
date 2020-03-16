package com.banyuan.club;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 1:41 下午
 */
public class TestPerson {


  public static void main(String[] args) {
    Person  person=new Person("34567890","张三w","栖霞区");
    Person  person2=new Person("34567890","张三","栖霞区");

    //System.out.println(person.equals(person2));

    //我们要让自己算完全的遵循我们自己的意愿来进行判断
    System.out.println(person.equals(person2));



  }


}
