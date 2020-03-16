package com.banyuan.club.Homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 9:55 上午
 */
public class HourEmp  implements Employee {

  private String name;

  private  double  hour;
  private  double  hourMoney;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHour() {
    return hour;
  }

  public void setHour(double hour) {
    this.hour = hour;
  }

  public double getHourMoney() {
    return hourMoney;
  }

  public void setHourMoney(double hourMoney) {
    this.hourMoney = hourMoney;
  }

  @Override
  public double calMoney() {
    double   money=this.hourMoney*this.hour;
    return money;
  }
}
