package com.banyuan.club.homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 9:12 上午
 */
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
1.模拟在校学生选课系统,使用集合完成
要求：1.学生类:学号，姓名，所选课程Set<Course>
学生可以对课程做增删改查操作
 */
public class Student {
  private String stuName;
  private int stuId;
  private Set<Course> courses;

  public Student() {
  }

  public Student(String stuname, int stuid, Set<Course> courses) {
    this.stuName = stuname;
    this.stuId = stuid;
    this.courses = courses;
  }

  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  public int getStuId() {
    return stuId;
  }

  public void setStuId(int stuId) {
    this.stuId = stuId;
  }

  public Set<Course> getCourses() {
    return courses;
  }

  public void setCourses(Set<Course> courses) {
    this.courses = courses;
  }

  @Override
  public String toString() {
    return "Student{" +
        "stuName='" + stuName + '\'' +
        ", stuId=" + stuId +
        ", courses=" + courses +
        '}';
  }
}