package com.banyuan.club.homework1;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 10:19 上午
 */
public class Course {
  private  String CId;
  private  String CName;

  public Course() {
  }

  public Course(String CId, String CName) {
    this.CId = CId;
    this.CName = CName;
  }

  public String getCId() {
    return CId;
  }

  public void setCId(String CId) {
    this.CId = CId;
  }

  public String getCName() {
    return CName;
  }

  public void setCName(String CName) {
    this.CName = CName;
  }

  @Override
  public String toString() {
    return "Course{" +
        "CId='" + CId + '\'' +
        ", CName='" + CName + '\'' +
        '}';
  }
}
