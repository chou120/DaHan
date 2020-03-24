package com.banyuan.club;

import java.io.File;
import java.io.IOException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/24 11:04 上午
 */
public class FileDemo1 {

  /*
    file    --->>  IO  CSV   XML<Maven工具使用>
    并发
    网络
    Swing  图形化编程
    设计模式
    反射
    lambda表达式  jdk1.8新特性
     mysql
     jdbc
     邮件发送(Mail)
     一阶段项目   一个完成  7个工作日

   */

  /**
   * 什么叫做文件?
   *    存储在计算机外部介质(磁盘)中的数据 叫文件
   *  使用编程对文件进行操作
   *     注册账号   上传图片(头像)  上传图像的核心代码就是文件操作
   *
   */
  public static void main(String[] args) throws IOException {
    File   file=new File("README.md");//文件路径
    //System.out.println(file.exists());
    if(!file.exists()){
        file.createNewFile();
    }
    //获取文件的相对路径  相对于当前项目的路径
    System.out.println(file.getPath());
    // 获取文件的绝对路径  /Users/sanye/dahanClass/DaHan/javaseFile/README.md
    System.out.println(file.getAbsolutePath());

    //System.out.println(file.delete());

    System.out.println(file.isDirectory());//判断是是否是个目录
    //System.out.println(file.getName());

    //System.out.println(file.renameTo(new File("read.md")));
    System.out.println(file.isFile());

    System.out.println(file.length());  //得到是文件内容的长度  21个字节   utf-8编码格式  每个汉字占3个字节

    file.setWritable(true);
    //System.out.println(file.setReadOnly());
    System.out.println(file.canWrite());

    System.out.println("--------"+file.getParentFile());

    new  File("test").mkdir(); //创建单个文件夹
    new  File("test/had/pro").mkdirs();//创建多级文件夹

    long  time=file.lastModified();//获取当前文件最近一次修改的时间 精确到秒

    System.out.println(time); //1585020651000

    System.out.println(file.isHidden()+"\n");

    file=new  File("/Users/sanye/dahanClass/DaHan");
    String [] str=file.list();
    for (String  st: str) {
      System.out.println("--"+st);
    }

    System.out.println();

    File[]  files=file.listFiles();
    for (File  f: files ) {
      System.out.println(f);
    }

    
  }


}
