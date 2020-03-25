package com.banyuan.club.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/25 10:30 上午
 */
public class Test5 {
  /*
  4.在程序中创建一个Student类型的对象，并把对象信息保存到/io/student.txt文件中，
    然后再从文件中把Student对象的信息读出,并且把读出来的数据重新塞给一个对象,然后显示在控制台上
   */

  public static void main(String[] args) throws IOException {
    File file = new File("io/student.txt");
    if (!file.exists()) {
      file.createNewFile();
    }

    List<Student> list = new ArrayList<>();
    list.add(new Student("张三", 23));
    list.add(new Student("张三2", 24));
    list.add(new Student("张三3", 25));
    list.add(new Student("张三4", 26));
    list.add(new Student("张三5", 27));
    list.add(new Student("张三6", 28));

    BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file,true));
    for (Student  student: list) {
        bufferedWriter.write("姓名:"+student.getName()+",年龄:"+student.getAge());
        bufferedWriter.newLine();
    }
    bufferedWriter.close();

    //读取文件
    List<Student>  studentList=new ArrayList<>();
    BufferedReader  bufferedReader=new BufferedReader(new FileReader(file));
    String  str=bufferedReader.readLine();  //  "姓名:张三,年龄:23"


    while (str!=null){
      String []strings=str.split(",");
      // 截取之后得到----->  "姓名:张三"(strings[0])    "年龄:23"(string[1])

      //对strings[0]进行截取 --->  st[0]="姓名"   st[1]="张三"
      String [] st=strings[0].split(":");

      //对strings[1]进行截取 --->  st1[0]="年龄"   st1[1]="23"
      String [] st1=strings[1].split(":");

      Student  student=new Student();

      student.setName(st[1]);
      student.setAge(Integer.valueOf(st1[1]));
      studentList.add(student);

      str=bufferedReader.readLine();
    }
    bufferedReader.close();

    for (Student  st:studentList) {
      System.out.println(st.toString());
    }




  }

}
