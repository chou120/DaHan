package com.banyuan.club.genericityInteface2;

import java.util.Objects;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 2:07 下午
 */
public class Person {

  private  String  name;

  private  String  address;

  public Person() {
  }

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
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
    return Objects.equals(name, person.name) &&
        Objects.equals(address, person.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address);
  }
}
