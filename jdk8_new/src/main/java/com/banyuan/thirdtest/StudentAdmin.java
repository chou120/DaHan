package com.banyuan.thirdtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/7 9:53 上午
 */
public class StudentAdmin {

  private static List<Student> list = new ArrayList<>();
  private static Scanner sc = new Scanner(System.in);
  private static int index = -1;

  private StudentAdmin() {

  }

  //打印功能菜单
  public static void menu() {
    System.out.println("case 10:添加学生");
    System.out.println("case 11:查找学生");
    System.out.println("case 12:uuuuu");
    System.out.println("case 13:mmmmmm");
    System.out.println("case 14:录入成绩");
    System.out.println("case 15:yyy");
    System.out.println("case 16:xxxxx");
    System.out.println("case 99:退出系统");

    System.out.println("请输入功能编号:");
    int  num=-1;
    int number = sc.nextInt();
    switch (number) {
      case 10:
        create();
        break;
      case 11:
        System.out.println("请输入要查询的学生编号:");
        num=sc.nextInt();
        select(num);
        break;
      case 14:
        System.out.println("请输入要录入成绩的学生编号:");
        num=sc.nextInt();
        input(num);
        print();
        break;
      case 99:
        System.out.println("您已退出...");
        System.exit(0);
        break;
      default:
        System.out.println("您的选择不再此范围内...");
        break;
    }

  }

  //设置新学生编号
  public static int intIndex() {
    return ++index;
  }

  //
  public static void print() {
    for (Student  student: list) {
      System.out.println(student.toString());
    }
  }


  //添加学生
  public static void create() {
    Student stu = new Student();
    stu.setNumber(intIndex());
    System.out.println("请输入姓名:");
    String name = sc.next();
    stu.setName(name);
    System.out.println("请输入年龄...");
    int age = sc.nextInt();
    stu.setAge(age);
    list.add(stu);
  }

  //根据编号查找学生
  public static Student select(int number) {
    for (int i = 0; i <list.size(); i++) {
      if(list.get(i).getNumber()==number){
        Student  student=list.get(i);
        list.remove(list.get(i));
        return  student;
      }
    }


    return null;
  }

  //根据编号录入学生成绩
  public static void input(int number) {
    Student student = select(number);
    if (student != null) {
      System.out.println("请输入java成绩:");
      int java=sc.nextInt();
      student.setJava(java);
      System.out.println("请输入linux成绩:");
      int linux=sc.nextInt();
      student.setLinux(linux);
      System.out.println("请输入sql成绩:");
      int sql=sc.nextInt();
      student.setSql(sql);
      int  sum=java+linux+sql;
      student.setSum(sum);
      student.setAvg(sum/3);

      //成绩录入完成  但是怎么塞回集合  这个时候集合里面已经有了一个这个对象(但是这个对象是没有成绩的)
      list.add(student);

    }else{
      System.out.println("没有这个学生,请重新输入学生编号...");
      number=sc.nextInt();
      select(number);
    }
  }
}
