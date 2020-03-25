package com.banyuan.club.pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/25 1:48 下午
 */
public class PropertiesDemo {

  public static void main(String[] args) throws IOException {
    Properties  properties=new Properties();// 文件流   但是呢是可以操作集合的
    properties.put("username", "zhoujian");
    properties.put("password", "123456");
    properties.put("address", "nanjingCity...");

//    properties.put("password2", "123456");
//
//    properties.put("password3", "123456");

//    System.out.println(properties);
//    System.out.println(properties.getProperty("username"));

//    Map<String ,String > map=new HashMap<>();
//    Set<String> set=map.keySet();  //无序  唯一
      File file=new File("pro.properties");
      if(!file.exists()){
        try {
          file.createNewFile();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    OutputStream  outputStream=new FileOutputStream(file);
    properties.store(outputStream,"today  is  周三");

    outputStream.close();

    properties=new Properties();
    System.out.println("还没读取之前:"+properties);
    InputStream  inputStream=new FileInputStream(file);
    properties.load(inputStream);
    inputStream.close();

    System.out.println("读取之后:"+properties);

    //取出一个个的数据

    //安装maven

  }

}
