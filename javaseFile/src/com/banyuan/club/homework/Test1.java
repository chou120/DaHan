package com.banyuan.club.homework;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/25 9:05 上午
 */
public class Test1 {

  static   List<File> list1 = new ArrayList<>();

  //1.到指定文件夹下面所有满足.java 文件

  public static void main(String[] args) {
    File file = new File("/Users/sanye/dahanClass/DaHan");
    if (!file.exists()) {
      System.out.println("文件不存在....");
    }

    getJavaFile(file);  //自己调用自己

    for (File  f:list1) {
      System.out.println(f);
    }

    //阶乘   斐波那契数列   猴子偷桃    烧脑:汉诺塔

  }

  //使用地柜的方式 得到所有的.java文件
  public static void  getJavaFile(File file) {
    File[] file1 = file.listFiles();
    for (File f : file1) {
      if (f.isDirectory()) {
        getJavaFile(f); //如果是文件夹重新调用一下方法
      } else {
        if (f.getName().endsWith(".java")) {
          list1.add(f);
        }
      }
    }
//    for (File f : list) {
//      System.out.println(f);
//    }

  }

}
