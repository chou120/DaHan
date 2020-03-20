package com.banyuan.club.collection.homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 10:39 上午
 */
public class Student {
  private  Integer stuId=9526;
  private  String  stuName;

  public Student() {

  }

  public Integer getStuId() {
    return stuId;
  }

  public void setStuId(Integer stuId) {
    this.stuId = stuId;
  }

  public Student(String stuName) {
    this.stuName = stuName;
  }

  public Student(Integer stuId, String stuName) {
    this.stuId = stuId;
    this.stuName = stuName;
  }

  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  @Override
  public String toString() {
    return "Student{" +
        "stuId=" + stuId +
        ", stuName='" + stuName + '\'' +
        '}';
  }
}
