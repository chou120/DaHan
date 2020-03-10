package com.banyuan.oop4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 11:07 上午
 */
public class HuaWeiEmployee {

  private String empNumber;
  private String empName;
  private String empIDCard;
  private String job;

  private Department  department;//对目标类的引用

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public HuaWeiEmployee() {
  }

  public HuaWeiEmployee(String empNumber, String empName, String empIDCard, String job,
      String departmentName, String departmentAddress, String departmentNumber) {
    this.empNumber = empNumber;
    this.empName = empName;
    this.empIDCard = empIDCard;
    this.job = job;
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

  @Override
  public String toString() {
    return "HuaWeiEmployee{" +
        "empNumber='" + empNumber + '\'' +
        ", empName='" + empName + '\'' +
        ", empIDCard='" + empIDCard + '\'' +
        ", job='" + job + '\'' +
        ", department=" + department.toString() +
        '}';
  }
}
