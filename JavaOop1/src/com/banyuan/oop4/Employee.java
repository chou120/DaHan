package com.banyuan.oop4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 10:55 上午
 */
public class Employee {
  //
  private  String  empNumber;
  private  String  empName;
  private  String  empIDCard;
  private  String  job;
  private  double  monthMoney;

  //把部门的对象作为一个属性
  private  Department  department; //对目标类进行引用

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Employee() {
  }

  public Employee(String empNumber, String empName, String empIDCard, String job, double monthMoney,
      String departmentName, String departmentAddress, String departmentNumber) {
    this.empNumber = empNumber;
    this.empName = empName;
    this.empIDCard = empIDCard;
    this.job = job;
    this.monthMoney = monthMoney;
  }

  public String getEmpNumber() {
    return empNumber;
  }

  public void setEmpNumber(String empNumber) {
    this.empNumber = empNumber;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getEmpIDCard() {
    return empIDCard;
  }

  public void setEmpIDCard(String empIDCard) {
    this.empIDCard = empIDCard;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public double getMonthMoney() {
    return monthMoney;
  }

  public void setMonthMoney(double monthMoney) {
    this.monthMoney = monthMoney;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "empNumber='" + empNumber + '\'' +
        ", empName='" + empName + '\'' +
        ", empIDCard='" + empIDCard + '\'' +
        ", job='" + job + '\'' +
        ", monthMoney=" + monthMoney +
        ", department名称=" + department.getDepartmentName() +
        '}';
  }
}
