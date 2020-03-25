package com.banyuan.club.io3;

import java.io.Serializable;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/25 1:36 下午
 */
public class Person implements Serializable {

  private  String name;
  private  Integer age;

  public Person(String name, Integer age) {
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

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
