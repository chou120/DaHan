package com.banyuan.test;

import com.banyuan.oop5.Person;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 3:32 下午
 */
public class TestTool {


  public static void main(String[] args) {
    //添加操作
    Person  person=new Person();
    person.setAge(34);
    person.setCountry("🇨🇳");
    person.setName("大保健");
    Tool.addPerson(person);

    Person  person2=new Person();
    person2.setAge(24);
    person2.setCountry("🇨🇳");
    person2.setName("保健");
    Tool.addPerson(person2);

    Person  person3=new Person();
    person3.setAge(12);
    person3.setCountry("🇨🇳");
    person3.setName("小保健");
    Tool.addPerson(person3);

   // Tool.showInfo();

    // 删除
    Tool.delPerson("保健");

    //Tool.showInfo();

    //修改
    Tool.updatePersonByName("小保健", 22);
    Tool.showInfo();

    //查找
    Person   p=Tool.selectByName("小保健");
    System.out.println(p.toString());


  }



}
