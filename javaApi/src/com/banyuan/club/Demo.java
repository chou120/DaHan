package com.banyuan.club;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 11:23 上午
 */
public class Demo  extends   Object{

  // Object  是所有类的父类
  public static void main(String[] args) throws CloneNotSupportedException {

    Object  obj=new Object();

    System.out.println(obj.getClass());  //表示在哪个类路径下

    //System.out.println("----"+obj.getClass().getName());

    System.out.println(Integer.toHexString(obj.hashCode())); //对象在内存中的 地址

    System.out.println(obj.toString()); //java.lang.Object@610455d6

    Object  obj2=new  Object();
    System.out.println(Integer.toHexString(obj2.hashCode()));

    //Object 比的是 对象的地址        如果equals() 被重写了 一般是要进行地址和内容的比较
    //
    // 请问: equals()比较两个对象是否是同一个对象根据现实生活中  能完成咱们的 需求吗？
    System.out.println(obj.equals(obj2));


    Student   student=new  Student();
    Object   ob=student.clone();  //得到的是一个clone的副本

    Student    stu=(Student) ob;

    //请问  student 和 stu两个对象是否是同一个对象

    System.out.println(student.hashCode());
    System.out.println(stu.hashCode());


    // 请问: equals()比较两个对象是否是同一个对象根据现实生活中  能完成咱们的 需求吗？
    /*
         现实生活中 能不能根据两个人相同的信息 去判断这两个人其实就是同一个人？




     */





  }

}
