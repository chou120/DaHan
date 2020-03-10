package com.banyuan.oop4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 11:09 上午
 */
public class Department {

  private String departmentName;//部门名称
  private String departmentAddress; //因为存在分部  可能同一个部门  但是呢 分布在全国各地
  //当分部多了的时候  给每个部门唯一的标识    001    002  003
  private String departmentNumber;//部门编号

  public Department() {
  }

  public Department(String departmentName, String departmentAddress,
      String departmentNumber) {
    this.departmentName = departmentName;
    this.departmentAddress = departmentAddress;
    this.departmentNumber = departmentNumber;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public String getDepartmentAddress() {
    return departmentAddress;
  }

  public void setDepartmentAddress(String departmentAddress) {
    this.departmentAddress = departmentAddress;
  }

  public String getDepartmentNumber() {
    return departmentNumber;
  }

  public void setDepartmentNumber(String departmentNumber) {
    this.departmentNumber = departmentNumber;
  }

  @Override
  public String toString() {
    return "Department{" +
        "departmentName='" + departmentName + '\'' +
        ", departmentAddress='" + departmentAddress + '\'' +
        ", departmentNumber='" + departmentNumber + '\'' +
        '}';
  }
}
