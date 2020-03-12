package com.banyuan.homework3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 9:26 上午
 */
public class TestAccount {

  /*
    (1)创建一个Customer ,名字叫 Jane Smith, 他有一个账号为1000,余额为2000元,年利率为 1.23% 的账户。
    (2)对Jane Smith操作。
    存入 100 元,再取出960元。再取出2000元。打印出Jane Smith 的基本信息
    成功存入 :100.0,成功取出:960.0,余额不足,取款失败
    Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23%, balance is 1140.0
    上面这句话是Customer 类里面的一个display方法 被调用时候 就输出类似语句
   */
  public static void main(String[] args) {
//    Customer  customer=new Customer();
//    customer.setFirstName("Jane");
//    customer.setLastName("Smith");
//
//    Account  account=new Account();
//    account.setAccountId("1000");
//    account.setBalance(2000);
//    account.setAnnualInterestRate(1.23E-2);
//
//    account.deposit(100);
//    String   result=account.withdraw(960);
//    System.out.println(result);
//    result=account.withdraw(2000);
//    System.out.println(result);
//
//    customer.setAccount(account);
//    System.out.println(customer.display());

      //一般情况空指针异常 表示 要么没有检测到数据   要么就是引用为null  极少的情况下  你程序写的逻辑不对 导致传递数据不及时
    String  [] str=new  String[3];
   // System.out.println(str[1]);
    str=null;
   // System.out.println(str[1]);

    String []  st=new  String[20];  //系统默认给null
    st[0]="asuashdia";
    st[1]="凯爹";

    Customer [] customers=new  Customer[10];  //系统不会自动赋值
    customers[0]=new Customer();
    customers[1]=new Customer();

    for (int i = 0; i < customers.length; i++) {
      System.out.println(customers[i].toString());
    }

  }
}
