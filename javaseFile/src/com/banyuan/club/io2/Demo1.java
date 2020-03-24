package com.banyuan.club.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/24 4:12 下午
 */
public class Demo1 {

  //字符流

  public static void main(String[] args) throws IOException {

    File file=new File("test/1.txt");
    Writer  writer=null;
    try {
      writer=new FileWriter(file);
      writer.write("asdasds");
      writer.flush();

      writer.write("uthgrv12312312312".toCharArray());
      writer.flush();

      Reader  reader=new FileReader(file);

      char [] ch=new char[(int) file.length()];
      //一个一个读取   每一个字符进行判断  如果字符和汉字在一起  怎么去处理
      reader.read(ch);
      System.out.println(new  String(ch,0,ch.length));


    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      writer.close();
    }


    //缓冲字符
    BufferedWriter    bufferedWriter=new BufferedWriter(new FileWriter(file));
    bufferedWriter.write("哈哈桑撒");
    bufferedWriter.newLine();

    bufferedWriter.write("哈哈桑撒2");
    bufferedWriter.newLine();
    bufferedWriter.write("哈哈桑撒3");
    bufferedWriter.flush();

    BufferedReader  bufferedReader=new BufferedReader(new FileReader(file));

//    char [] ch=new char[(int) file.length()];
//
//    bufferedReader.read(ch);


//    System.out.println(new String(ch));

    String   str=bufferedReader.readLine();
    while(str!=null){
      System.out.println(str);
      str=bufferedReader.readLine();
    }

  }

}
