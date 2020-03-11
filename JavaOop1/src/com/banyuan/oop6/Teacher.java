package com.banyuan.oop6;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/11 1:34 下午
 */
public class Teacher {  //父类

  private String name = "张三分";
  private String address = "洛杉矶";
  private int age = 22;

  //访问修饰符的问题
  public String country = "中国";
  String city = "南京";
  protected String IDCard = "342901123123123122";

  public Teacher() {
    System.out.println("父类构造器执行....");
  }

  public Teacher(String name, String address, int age) {
    this.name = name;
    this.address = address;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void show() {
    System.out.println("用来显示自己多有钱的功能...");
  }



  public  static  void  test(){
    System.out.println("我是父类中的 静态方法....");
  }



  @Override
  public String toString() {
    return "Teacher{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", age=" + age +
        '}';
  }
}
