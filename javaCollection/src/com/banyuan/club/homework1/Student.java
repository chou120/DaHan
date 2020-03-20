package com.banyuan.club.homework1;

import com.banyuan.club.homework.Stu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 10:17 上午
 */
public class Student {

  /*
    1.模拟在校学生选课系统,使用集合完成
  要求：1.学生类:学号，姓名，所选课程Set<Course>
  学生可以对课程做增删改查操作
  2.课程类：编号 课程名称
  3.学生选课清单类
  完成:有n个人 显示出每个人所选的课程信息
  如：姓名：张三:    所选课程如下： 9527  java基础 ，9768 C# ，9898 javaScript 等

   */

  private String stuNum;
  private String stuName;
  private Set<Course> courseSet;

  public Student(String stuNum, String stuName,
      Set<Course> courseSet) {
    this.stuNum = stuNum;
    this.stuName = stuName;
    this.courseSet = courseSet;
  }

  public Student() {
  }

  public String getStuNum() {
    return stuNum;
  }

  public void setStuNum(String stuNum) {
    this.stuNum = stuNum;
  }

  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  public Set<Course> getCourseSet() {
    return courseSet;
  }

  public void setCourseSet(Set<Course> courseSet) {
    this.courseSet = courseSet;
  }

  @Override
  public String toString() {
    return "Student{" +
        "stuNum='" + stuNum + '\'' +
        ", stuName='" + stuName + '\'' +
        ", courseSet=" + courseSet +
        '}';
  }
}

class Test {

  /**
   * 完成:有n个人 显示出每个人所选的课程信息 如：姓名：张三:    所选课程如下： 9527  java基础 ，9768 C# ，9898 javaScript 等
   *
   * @param args
   */

  public static void main(String[] args) {
    Set<Course> set = null;
    List  list=new ArrayList();
    for (int i = 0; i < 5; i++) {
      set = new HashSet<>();
      set.add(new Course("9527", "java"));
      set.add(new Course("9528", "CVA"));
      set.add(new Course("9529", "php"));

      Student student = new Student("952" + i, "老三" + i, set);
      list.add(student);

    }

    for (Object ob : list) {
      Student  stu=(Student)ob;
      System.out.println("学生信息如下:"+stu.getStuNum()+","+stu.getStuName());
      Set<Course> s=stu.getCourseSet();
      System.out.println("学生的课程信息如下:"+s+"\n");

    }



  }

}


