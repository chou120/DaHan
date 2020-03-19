package com.banyuan.club.set;

import java.util.Objects;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/19 2:06 下午
 */
public class Person implements  Comparable{

  private  String  name;
  private  int age;

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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return age == person.age &&
        Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }


  @Override
  public int compareTo(Object o) {
    //如果是升序 当前对象参数在前  - 传递对象的参数在后
    Person person=(Person)o;
    int num=  this.age-person.getAge()> 0 ? 1 : -1;
    return num;
  }




}
