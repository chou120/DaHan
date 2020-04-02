package com.banyuan.lambda1;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 3:00 下午
 */
public class TestLambda {

  public static void main(String[] args) {

//    Runnable runnable=new  Runnable(){
//      @Override
//      public void run() {
//        System.out.println("我是run....");
//      }
//    };
//    runnable.run();
    //使用lambda表达式

//    Runnable runnable1=()->System.out.println("我是run....");
//    runnable1.run();

    TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
      }
    });


    //lambda
    //ts=new  TreeSet<>((o1,o2) -> Integer.compare(o1.length(), o2.length()));

//    Mylambda  mylambda=new   Mylambda(){
//      @Override
//      public void show() {
//        System.out.println("我是你爸爸...");
//      }
//    };
//    mylambda.show();

    //使用lambda
    //Mylambda mylambda1= (str,in) ->System.out.println("我是你爸爸..."+str);
   //s mylambda1.show("真伟大",1231232);

    Mylambda  mylambda=(x,y)-> x.compareTo(y);

    System.out.println(mylambda.show(732, 55123));






  }

}
