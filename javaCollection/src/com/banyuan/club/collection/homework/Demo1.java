package com.banyuan.club.collection.homework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 10:29 上午
 */
public class Demo1 {

  /*

  4.产生10个1~20之间的随机数，要求随机数不能重复
  5.手动输入一行字符串，去掉其中重复字符，打印出不同的那些字符

   */
  public static void main(String[] args) {
  //  Set set=new HashSet<>();
//    for (int i = 0; i <10; i++) {
//      int  num=(int)(Math.random()*20+1);
//        if(!set.contains(num)){
//          set.add(num);
//        }else{
//          i--;
//        }
//    }
//      while(set.size()<10){
//        int  num=(int)(Math.random()*20+1);
//        set.add(num);
//      }
//    System.out.println(set);

    Scanner  sc=new Scanner(System.in);
    System.out.println("请输入一串英文字符:");
    String  str=sc.nextLine();
    char [] ch=str.toCharArray();

    Set  set=new HashSet();
    for (char  c:ch) {
      set.add(c);
    }
    System.out.println(set);

  }


}
