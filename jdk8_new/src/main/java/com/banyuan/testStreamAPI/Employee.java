package com.banyuan.testStreamAPI;

import java.util.Objects;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/3 11:01 上午
 */
public class Employee {

  private  int  num;
  private  String  name;
  private  int  age;
  private  Double  money;

  public Employee() {
  }

  public Employee(int num, String name, int age, Double money) {
    this.num = num;
    this.name = name;
    this.age = age;
    this.money = money;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
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

  public Double getMoney() {
    return money;
  }

  public void setMoney(Double money) {
    this.money = money;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return num == employee.num &&
        age == employee.age &&
        Objects.equals(name, employee.name) &&
        Objects.equals(money, employee.money);
  }

  @Override
  public int hashCode() {
    return Objects.hash(num, name, age, money);
  }

  @Override
  public String toString() {
    return "Employee{" +
        "num=" + num +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", money=" + money +
        '}';
  }
}
