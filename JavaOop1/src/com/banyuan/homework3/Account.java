package com.banyuan.homework3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 9:19 上午
 */
public class Account {

  private  String  accountId;
  private  double  balance;
  private  double  annualInterestRate;

  public  String withdraw(double  money){  //取款
    if(this.balance>money){
        this.balance=this.balance-money;
        return  "成功取出"+money+",余额还剩:"+this.balance;
    }else {
        return "您的余额不足...";
    }
  }
  public void deposit(double  money){ //存款
    this.balance=this.balance+money;
    System.out.println("成功存入:"+money);
  }

  public Account() {
  }

  public Account(String accountId, double balance, double annualInterestRate) {
    this.accountId = accountId;
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  @Override
  public String toString() {
    return "Account{" +
        "accountId='" + accountId + '\'' +
        ", balance=" + balance +
        ", annualInterestRate=" + annualInterestRate +
        '}';
  }

  /*
  A.写一个名为Account的类模拟账户。该类包括的属性:账号id,余额balance,年利率annualInterestRate;
包含的方法:访问器方法(getter和setter方法),取款方法withdraw(),存款方法deposit()。 提示:在提款方法withdraw中,需要判断用户余额是否能够满足提款数额的要求,如果不能,应给出提示。

B.创建Customer类。
a. 声明三个私有对象属性:firstName、lastName和account。
b. 声明一个公有构造器,这个构造器带有两个代表对象属性的参数(f和l)
c. 声明两个公有存取器来访问该对象属性,方法getFirstName和getLastName返回相应的属性。
d. 声明setAccount 方法来对account属性赋值。
e. 声明getAccount 方法以获取account属性。

C写一个测试程序。
(1)创建一个Customer ,名字叫 Jane Smith, 他有一个账号为1000,余额为2000元,年利率为 1.23% 的账户。
(2)对Jane Smith操作。
存入 100 元,再取出960元。再取出2000元。打印出Jane Smith 的基本信息
成功存入 :100.0,成功取出:960.0,余额不足,取款失败
Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23%, balance is 1140.0
上面这句话是Customer 类里面的一个display方法 被调用时候 就输出类似语句

   */
}
