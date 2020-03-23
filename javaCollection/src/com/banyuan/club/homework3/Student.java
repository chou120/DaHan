package com.banyuan.club.homework3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 10:02 上午
 */
public class Student {
//  学生考试管理系统
//  要求：1.学生类,学生编号,学生姓名,学生密码,学生成绩
//       2.试题类：试题编号（自增长）,试题名称,试题选项（四个 A B C D）,试题答案
//       3.现有两个数据存储容器,存储学生和存储考试试题,学生需要登录考试系统才能进行考试,每答对一题加十分,如果答错没有分
//       现在有一个学生进行考试,请在控制台输出这个学生的考试成绩

  private  String  stuNum;
  private  String  stuName;
  private  String  password;
  private  Double  score;

  public Student() {
  }

  public Student(String stuNum, String stuName, String password, Double score) {
    this.stuNum = stuNum;
    this.stuName = stuName;
    this.password = password;
    this.score = score;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Student{" +
        "stuNum='" + stuNum + '\'' +
        ", stuName='" + stuName + '\'' +
        ", password='" + password + '\'' +
        ", score=" + score +
        '}';
  }
}
