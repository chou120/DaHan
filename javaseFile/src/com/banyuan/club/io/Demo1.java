package com.banyuan.club.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/24 1:44 下午
 */
public class Demo1 {

  /*
     java对文件的操作  使用 输入/输出流进行操作

     `
     字节流    字节输入流
              字节输出流
              字节缓冲流


     字符流    字符输入流
              字节输出流
              字符缓冲流

   */
  public static void main(String[] args) {
    File file=new  File("test/1.txt");
    if(!file.exists()){
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    List<String> list=new ArrayList<>();
    list.add("闫正池");
    list.add("王淼");
    list.add("赵一帆");
    list.add("韩朝");
    list.add("石金玉");
    list.add("蒋凡安");
    list.add("褚雪琪");
    list.add("孙可可");
    list.add("刘耀");
    list.add("谈冬冬");
    list.add("高新光");


    //往文件中写入数据
    OutputStream   outputStream=null;
    try {
      outputStream =new FileOutputStream(file);//追加内容
      /*
        每写入五个数据 每个数据后面 + ','  进行换行  如果是最后一个数据 加一个 '.'

       */
      for (int i = 0; i <list.size(); i++) {
        outputStream.write(list.get(i).getBytes());
        if(i!=list.size()-1){
          if((i+1)%5==0){
            outputStream.write("\n".getBytes());
          }else{
            outputStream.write(",".getBytes());
          }
        }else {
          outputStream.write(".".getBytes());

        }
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();

    }finally {
      try {
        outputStream.close();  //为什么要关闭流
      } catch (IOException e) {
        e.printStackTrace();
      }
    }


    //进行数据读取
    InputStream  inputStream=null;
    try {
    inputStream =new FileInputStream(file);
   // int   line=inputStream.read(); //一次读取一个字节  如果已经读了一次 就表示文件里面的那个类似于游标的标志往后走了一步
    byte []bt=new  byte[(int)file.length()];  //得到一个 字节数组

    //此种方式 是一个字节一个字节进行读取
//    int key=0;
//    while (line!=-1){
//      bt[key]=(byte) line;
//      key++;
//     // System.out.println(line);
//      line=inputStream.read();
//    }

      //一次性读完
      inputStream.read(bt);

    //把字节数组转换成字符型
      String   str=new String(bt,0,bt.length);

      System.out.println("文件里面的内容如下:"+str);


    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        inputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }


  }






}
