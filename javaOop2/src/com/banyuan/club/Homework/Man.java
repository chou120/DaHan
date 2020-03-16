package com.banyuan.club.Homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 10:02 上午
 */
public class Man implements  Employee{
  private  double hours;
  private  final   double  BALANCE_MONEY=4500;
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  @Override
  public double calMoney() {
    double   sumMoney=0;
    if(this.hours<196){
      sumMoney=sumMoney+BALANCE_MONEY;
    }else{
      sumMoney=sumMoney+(this.hours-196)*200+BALANCE_MONEY;
    }
    return sumMoney;
  }
}
