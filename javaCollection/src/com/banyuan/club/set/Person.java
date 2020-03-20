package com.banyuan.club.set;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/19 2:06 下午
 */
public class Person implements Comparable {

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
    //只需要判断当前对象的各个属性和传递过来的 o对象的属性进行比较 就行
    Person p=(Person)o;
    int  num=this.age-p.getAge();
    //num=0 表示 年龄  (如果年龄都不一样  就没有必要去比较姓名)
    // 如果年龄一样就去比较名字长度
    // 如果名字的长度一样  就去比较字符从内容是否一样  如:// abdc   hgfd

    int  num1=    num==0 ? this.name.length()-p.name.length():num;
    // abdc   hgfd
    int num2=  num1==0 ? this.name.compareTo(p.name):num1;
    // 如果长度一样   那就比较内容

    return  num2;
  }
    //课堂练习:实现Comparable接口比较只是其中的一种方式  还有一种方式 实现 Comparator
    //你们手动去尝试一下:  年龄  工资   姓名
    //做完之后 两者进行对比





}
