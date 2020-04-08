package com.banyuan.reflect;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/8 10:24 上午
 */
public class Student {


  private  String  stuName="骄傲哈哈";
  private  String  password;
  private  String  email;//邮箱
  private  int   age;


  private  void method(){
    System.out.println("我是私有化的方法....");
  }


  public Student() {
    System.out.println("我是无参构造器....");
  }

  public Student(String stuName, String password, String email, int age) {
    this.stuName = stuName;
    this.password = password;
    this.email = email;
    this.age = age;
    System.out.println("我是有参构造器...");
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "stuName='" + stuName + '\'' +
        ", password='" + password + '\'' +
        ", email='" + email + '\'' +
        ", age=" + age +
        '}';
  }
}
