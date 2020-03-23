package com.banyuan.club.test;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 4:02 下午
 */
public class Employ {

  private  String  firstName;
  private  String  secondName;


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  @Override
  public String toString() {
    return "Employ{" +
        "firstName='" + firstName + '\'' +
        ", secondName='" + secondName + '\'' +
        '}';
  }
}
