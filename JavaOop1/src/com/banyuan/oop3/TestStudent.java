package com.banyuan.oop3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 10:27 上午
 */
public class TestStudent {

    public static void main(String[] args) {

      //请问:对象是被谁创建的？
      Student  student=new  Student();
      student.setAddress("西栖霞区");
      student.setAge(23);
      student.setStuName("剑圣");

      System.out.println(student.toString());
     // Student  student2=new  Student();


      //通过有参构造器创建对象  在创建对象的同时给对象的属性赋值
      Student   stu=new  Student("贾克斯",25,"峡谷之巅");
      System.out.println(stu.toString());

      //
      Student   stu1=new   Student("小学生之手",45);

      System.out.println(stu1.toString());

      Student   stu2=new Student("凯爹");
      System.out.println(stu2.toString());




    }

}
