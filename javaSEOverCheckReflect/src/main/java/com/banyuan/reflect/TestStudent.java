package com.banyuan.reflect;

import java.lang.reflect.Proxy;
import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/8 10:51 上午
 */
public class TestStudent {

  public static void main(String[] args) {

    System.out.println("欢迎进入此界面");
    Scanner  sc=new Scanner(System.in);
    StudentDao studentDao=new StudentDaoImpl();

    while(true){
      System.out.println("请输入功能编号:");
      int number=sc.nextInt();
      switch (number){
        case 1:
          System.out.println("请输入登录账号:");
          String  name=sc.next();
          System.out.println("请输入密码:");
          String  password=sc.next();
           boolean flag= studentDao.login(name,password);
              if(flag){
                System.out.println("登录之后做其他事...");
                break;
              }
          break;
        case 2:
          Student  student=new Student();
          System.out.println("请输入学生名:");
          student.setStuName(sc.next());
          System.out.println("请输入学生密码:");
          student.setPassword(sc.next());
          //在注册邮箱的时候 为了防止是机器人在注册 在注册成功之前要进行邮箱验证
          System.out.println("请输入邮箱:");
          student.setEmail(sc.next());
          System.out.println("请输入年龄:");
          student.setAge(sc.nextInt());

          MyInvocationHandler  myInvocationHandler=new MyInvocationHandler(studentDao);

          StudentDao  sd=(StudentDao) Proxy.newProxyInstance(studentDao.getClass().getClassLoader(),
              new Class[]{StudentDao.class} ,myInvocationHandler);

          sd.register(student);

          break;
        default:
          System.exit(0);
          break;
      }


    }

  }

}
