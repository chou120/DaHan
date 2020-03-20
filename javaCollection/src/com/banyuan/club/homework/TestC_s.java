package com.banyuan.club.homework;

import com.sun.xml.internal.xsom.impl.scd.Iterators.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 9:12 上午
 */
public class TestC_s {

  public static void main(String[] args) {
    Set<Course> courses = new HashSet<>();
//        Course course=new Course("java基础",9527);
//        Course course1=new Course("C#",9768);
//        Course course2=new Course("javaScript",9898);
    courses.add(new Course("java基础",9527));
    courses.add(new Course("C#",9768));
    courses.add(new Course("javaScript",9898));
    Student student=new Student("张三",1,courses);
    //Student student2=new Student("张三2",2,courses);
   // System.out.println(student);


    courses = new HashSet<>();
    courses.add(new Course("java基础2",9527));
    courses.add(new Course("C#2",9768));
    courses.add(new Course("javaScript2",9898));
    Student student2=new Student("张三2",1,courses);

    List array=new ArrayList<>();
    array.add(student);
    array.add(student2);

   Iterator  it= array.iterator();
    while (it.hasNext()){
      Student  stu=(Student)it.next();
      System.out.println(stu.toString());
    }

  }

}
