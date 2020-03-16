package com.banyuan.club.Homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 9:57 上午
 */
public class SalEmp  implements  Employee{

  private String name;
  private  double  salMoney;
  private  final  double  BALANCE=3000;//基本工资


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalMoney() {
    return salMoney;
  }

  public void setSalMoney(double salMoney) {
    this.salMoney = salMoney;
  }

  @Override
  public double calMoney() {
    double moneySum=0;
    if(this.salMoney<10000){
      moneySum=moneySum+this.salMoney*0.1+BALANCE;
    }else  if(this.salMoney>10000&&this.salMoney<100000){
      moneySum=moneySum+this.salMoney*0.15+BALANCE;
    }else{
      moneySum=moneySum+this.salMoney*0.18+BALANCE;
    }

    return moneySum;
  }
}
