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
 * @date 2020/3/25 9:52 上午
 */
public class Test3 {

  //3.创建a/test.txt文件并在其中输入"hello world",
  //创建一个输入流读取该文件中的文本,并且把小写的l变成大写L再利用输出流写入到b/test.txt中

  public static void main(String[] args) {
    File file=new File("a");
    File  file1=null;
    if(!file.exists()){
      file.mkdir();
    }
    try {
      file1=new  File(file,"test.txt");
      file1.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
    BufferedWriter  bufferedWriter=null;
    try {
      bufferedWriter =new BufferedWriter(new FileWriter(file1));
      bufferedWriter.write("hello world");
      bufferedWriter.flush();

    } catch (IOException e) {
      e.printStackTrace();
    }finally {
     if(bufferedWriter!=null){
       try {
         bufferedWriter.close();
       } catch (IOException e) {
         e.printStackTrace();
       }
     }
    }

    BufferedReader   bufferedReader=null;
    try {
      bufferedReader =new BufferedReader(new FileReader(file1));
      String  str=bufferedReader.readLine();
     if( str.contains("l")){
       str=str.replace("l", "L");
     }
      new  File("b").mkdir();
     file1=new  File("b","test.txt");

      file1.createNewFile();

      bufferedWriter =new BufferedWriter(new FileWriter(file1));

      bufferedWriter.write(str);
      bufferedWriter.flush();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }


  }



}
