package com.banyuan.oop3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 9:59 上午
 */
public class Student {

  private  String stuName;
  private  int  age;
  private  String  address;

  //对象是被类里面的构造器创建的
  // 访问修饰符  类名(参数...){   }
  public  Student(){  //构造函数  无参构造函数  在一个类中如果没有显示的构造器  java会默认的提供一个无参构造器
    System.out.println("我是无参构造器...");
  }
  /*
    如果没有无参构造器但是类里面有有参构造器   那么只能通过有参构造器来创建对象 系统不会在自动提供无参构造器
   */

  //有参构造器
  public  Student(String stuName,int  age,String  address){
      this.stuName=stuName;
      this.age=age;
      this.address=address;
    System.out.println("我是有参构造函数...");
  }

  public  Student(String stuName,int  age){
    this.stuName=stuName;
    this.age=age;
    System.out.println("我是有参构造函数...22222....");
  }

  public  Student(String stuName){
    this.stuName=stuName;
    System.out.println("我是有参构造函数...22222....");
  }
  /*
      当 方法名一样  参数列表不一样时 这个叫方法的重载(方法的重载跟返回值没有任何关系)
   */

  public  double sum(double  x,double  y){
    return x+y;
  }

  public  int   sum(int  x,int y){
    return  x+y;
  }

  public  int   sum(int x,int y,int z){

    return  x+y+z;
  }

  public  int   sum(int x,int y,int z,int q){
    return  x+y+z+q;
  }



  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Student{" +
        "stuName='" + stuName + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        '}';
  }
}
