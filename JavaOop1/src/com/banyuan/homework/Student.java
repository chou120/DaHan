package com.banyuan.homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 9:24 上午
 */
public class Student {

  private  String  stuName;
  private  double  chinese;
  private  double  math;
  private  double  english;
  private  double  science;

  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  public double getChinese() {
    return chinese;
  }

  public void setChinese(double chinese) {
    this.chinese = chinese;
  }

  public double getMath() {
    return math;
  }

  public void setMath(double math) {
    this.math = math;
  }

  public double getEnglish() {
    return english;
  }

  public void setEnglish(double english) {
    this.english = english;
  }

  public double getScience() {
    return science;
  }

  public void setScience(double science) {
    this.science = science;
  }

  //求平均分的方法
  public  double  getAvgScore(){
    return  (this.chinese+this.math+this.english+this.science)/4;
  }

  @Override
  public String toString() {
    return "Student{" +
        "stuName='" + stuName + '\'' +
        ", chinese=" + chinese +
        ", math=" + math +
        ", english=" + english +
        ", science=" + science +
        '}';
  }




}
