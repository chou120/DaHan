package com.banyuan.constructor;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/3 9:56 上午
 */
public class Employee {

  private   String  name;
  private   String  address;

  public Employee() {
  }

  public Employee(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public  String  show(){
    System.out.println("我是员工里面的show");
    return  "去你妹的";
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
    return "Employee{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
