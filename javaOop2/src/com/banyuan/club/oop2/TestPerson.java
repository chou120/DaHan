package com.banyuan.club.oop2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 3:11 下午
 */
public class TestPerson {
//如果使用多态的方式创建对象并且调用子类特有的方法  是不可以调用

  public static void main(String[] args) {
    Person   p=new Student();
    //就想调用子类
    //Student  stu=new Student();
    //stu.study();  //不建议   占内存

    //向上转型
    //Person   p=new Student();

    //向下转型
     Student   student=(Student)p;
     student.study();
  }

}
