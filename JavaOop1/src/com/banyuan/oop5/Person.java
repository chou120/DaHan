package com.banyuan.oop5;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 1:35 下午
 */
public class Person {

  private  String name;
  private  int  age;
  private  String  country;//国家

  public Person(String name, int age, String country) {
    this.name = name;
    this.age = age;
    this.country = country;
  }

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", country='" + country + '\'' +
        '}';
  }
}
