package com.banyuan.oop;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/9 上午11:05
 */
public class Student {  //Student.class 创建对象
    // 对象就是按照类的模板来创建的   类是创建的对象的模板     对象是类所存在的实例
    // 学生 本身有什么属性


    public String   username;
    public String   address;
    public int    age;
    public double   weight;
    public float   height;

    // 学生 有什么行为特征
    public   void  sleep(){
      System.out.println(username+"在睡觉...");
    }

    public  void   eat(){
      System.out.println(username+"不知道在吃什么...");
    }

    public  void  paoNiu(){
      System.out.println(username+"泡妞...");
    }



}
