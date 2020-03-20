package com.banyuan.club.homework;

import java.util.Comparator;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 9:40 上午
 */
public class Stu {

  private String  stuNum;
  private String  name;
  private Integer score;

  public Stu(String stuNum, String name, Integer score) {
    this.stuNum = stuNum;
    this.name = name;
    this.score = score;
  }

  public Stu() {
  }

  public String getStuNum() {
    return stuNum;
  }

  public void setStuNum(String stuNum) {
    this.stuNum = stuNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Stu{" +
        "stuNum='" + stuNum + '\'' +
        ", name='" + name + '\'' +
        ", score=" + score +
        '}';
  }


}
