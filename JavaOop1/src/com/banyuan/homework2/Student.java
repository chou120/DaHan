package com.banyuan.homework2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/11 9:32 上午
 */
public class Student {
  //编号stuNum,姓名stuName,年级stuGrade,成绩stuScore
  private  String  stuNum;
  private  String  stuName;
  private  int  stuGrade;
  private  double stuScore;

  public Student(String stuNum, String stuName, int stuGrade, double stuScore) {
    this.stuNum = stuNum;
    this.stuName = stuName;
    this.stuGrade = stuGrade;
    this.stuScore = stuScore;
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

  public int getStuGrade() {
    return stuGrade;
  }

  public void setStuGrade(int stuGrade) {
    this.stuGrade = stuGrade;
  }

  public double getStuScore() {
    return stuScore;
  }

  public void setStuScore(double stuScore) {
    this.stuScore = stuScore;
  }

  @Override
  public String toString() {
    return "Student{" +
        "stuNum='" + stuNum + '\'' +
        ", stuName='" + stuName + '\'' +
        ", stuGrade=" + stuGrade +
        ", stuScore=" + stuScore +
        '}';
  }
}
