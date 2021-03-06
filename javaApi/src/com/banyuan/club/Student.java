package com.banyuan.club;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 11:33 上午
 */
public class Student  implements  Cloneable{

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }




  private   String  name;
  private   String   address;

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

    return "Student{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
