package com.banyuan.club.io1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/24 3:22 下午
 */
public class Demo1 {

  public static void main(String[] args) {
    File  file=new File("test/1.txt");

    //缓冲流的效率要高于普通流
    //缓冲流第一次在读取数据的时候是从磁盘上读取到缓冲区    后面都是从缓冲区读取了

    BufferedInputStream  bufferedInputStream=null;
    byte [] bytes=new byte[(int)file.length()];
    try {
      bufferedInputStream= new BufferedInputStream(new FileInputStream(file));

      bufferedInputStream.read(bytes);
     String  str=new String(bytes);
      System.out.println("-----"+str);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      try {
        bufferedInputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }


    //缓冲输入流
    BufferedOutputStream  bufferedOutputStream=null;
    try {
      bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(file,true));

      bufferedOutputStream.write(bytes);

      bufferedOutputStream.flush();   //把缓冲区中的数据刷新到文件中  并且没有关闭流  可以继续操作

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    //现在 程序执行到这步 发现  还要把数据往文件中写   但是 流已经关闭了
    /*
        如果流不关闭  导致不能把数据写入文件中   没有把缓存区的数据写入文件
     */

    try {
      bufferedOutputStream.write("我是大保健".getBytes());
      bufferedOutputStream.flush();

    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      try {

        bufferedOutputStream.close();

      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    //流的关闭顺序   先开后关   文件没有关闭一说


  }
}


