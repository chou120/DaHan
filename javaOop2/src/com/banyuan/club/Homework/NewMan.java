package com.banyuan.club.Homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 10:27 上午
 */
public class NewMan implements Employee {

  private int  number;
  private String  name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  public double calMoney() {
    return this.number*50;
  }
}
