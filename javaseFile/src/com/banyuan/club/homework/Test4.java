package com.banyuan.club.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/25 10:18 上午
 */
public class Test4 {

  //读取指定文件夹下（包括子文件）的所有的.java结尾的文件的内容并且把数据写到另一个文件中去
  static BufferedWriter bufferedWriter = null;
  static BufferedReader bufferedReader = null;

  public static void main(String[] args) throws IOException {

    getJavaFile(new File("/Users/sanye/dahanClass/DaHan"));


  }

  public static void getJavaFile(File file) throws IOException {
    File[] file1 = file.listFiles();
    for (File f : file1) {
      if (f.isDirectory()) {
        getJavaFile(f); //如果是文件夹重新调用一下方法
      } else {
        if (f.getName().endsWith(".java")) {
          bufferedReader = new BufferedReader(new FileReader(f));
          bufferedWriter =new BufferedWriter(new FileWriter(new File("test/1.txt"),true));
          String str = bufferedReader.readLine();
        while(str!=null){
          bufferedWriter.write(str+"\n");
          str = bufferedReader.readLine();
        }
          bufferedWriter.close();
          bufferedReader.close();


        }
      }
    }
  }

}
