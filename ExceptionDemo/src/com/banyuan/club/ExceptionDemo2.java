package com.banyuan.club;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/17 3:42 下午
 */
public class ExceptionDemo2 {

  public static void main(String[] args){
    /*
        try{

        }catch(){

        }finally{

        }

        try{

        }finally{

        }


     */
//  try {
//    Person p = null;
//    System.out.println(p.toString());
//  }catch (Exception  e){
//    e.printStackTrace();
//    //System.exit(0); //虚拟机正常退出
//  }finally {//只要虚拟机不停止  finally  一定会去执行
//    System.out.println("代码执行");  //专门用来释放资源用的  这个用法会体现在 文件流
//  }






  //对异常的处理2:抛出异常  throws   把错误抛给虚拟机处理  虚拟运行时一旦出现错误 就立马停止 整个程序就停止
//    Person  p=null;
//    System.out.println(p.toString());
//
//    System.out.println("哈撒个.....");








    //异常的继承
    // 父类方法如果抛出的异常是运行时异常  那么 子实现类的异常类型可以运行时异常的任何一个子类 其中 不抛出异常都行
    // 但是不能抛出总的Exception  因为 Exception类型 异常 包含了编译时异常

    // 空集是任何一个集合的子集

    //编译时异常
    SimpleDateFormat   sdf=new SimpleDateFormat();
    try {

      sdf.parse("");  //编译时异常 告诉计算机  这个方法可能会出错

    } catch (ParseException e) {
      e.printStackTrace();
    }




  }

}
