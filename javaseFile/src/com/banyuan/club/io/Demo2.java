package com.banyuan.club.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/24 2:48 下午
 */
public class Demo2 {

  public static void main(String[] args) {
      //自定义对象写入文件中
    List<Person>  list=new ArrayList<>();
    list.add(new Person("张三",23));
    list.add(new Person("刘亦菲",29));
    list.add(new Person("艾弗森",39));
    list.add(new Person("詹姆斯",25));

    //把自定义对象写入文件
    File file=new  File("Person.doc");
    if(!file.exists()){
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    OutputStream outputStream=null;
    try {
      outputStream =new FileOutputStream(file);
      for (int i = 0; i < list.size(); i++) {
        Person  person=list.get(i);
        outputStream.write(("姓名:"+person.getName()+",").getBytes());
        outputStream.write(("年龄:"+person.getAge()).getBytes());
        outputStream.write("\n".getBytes());
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if(outputStream!=null) {
        try {
          outputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

    }

    //作业2：把写入进去的文件内容  读取出来 并且把读取出来的数据 原封不动的赋值回去  "张三"--->name  23--->age





  }


}
