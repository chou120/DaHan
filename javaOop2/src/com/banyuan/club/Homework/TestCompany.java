package com.banyuan.club.Homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 10:17 上午
 */
public class TestCompany {

  public static void main(String[] args) {
    Company  company=new Company();
    HourEmp  hourEmp=new HourEmp();
    hourEmp.setHour(200);
    hourEmp.setHourMoney(10);
    hourEmp.setName("张三");

    HourEmp  hourEmp2=new HourEmp();
    hourEmp2.setHour(230);
    hourEmp2.setHourMoney(10);
    hourEmp2.setName("李四");

    company.addEmp(hourEmp);
    company.addEmp(hourEmp2);

    SalEmp  salEmp=new SalEmp();
    salEmp.setName("王五");
    salEmp.setSalMoney(5000);

    SalEmp  salEmp2=new SalEmp();
    salEmp2.setName("赵六");
    salEmp2.setSalMoney(200000);

    company.addEmp(salEmp);
    company.addEmp(salEmp2);


    Man  man=new  Man();
    man.setHours(205);
    man.setName("大保健");

    company.addEmp(man);


    NewMan newMan=new NewMan();
    newMan.setNumber(30);
    newMan.setName("田七");

    company.addEmp(newMan);
    //
    System.out.println("应发总工资和:"+company.getSalarySum());
    //  200*9+4500=6700
    //  39000+14500=53100;
    // 3500
    //2300   2000

    company.delGetByEmpName("张三", hourEmp);

    System.out.println(Company.count);


  }

}
