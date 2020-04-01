package com.banyuan.club;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/31 5:04 下午
 */
public class Test {


  public static void main(String[] args) {


    List lib=new  ArrayList<>();


//    String str="123, 456, 789, 123, 456";
//
//    //求每个整数出现的次数
//    String[] st=str.split(", ");
////    for (String  s:st) {
////      System.out.println(s);
////    }
//
//    Map<String,Integer> map=new HashMap<>();
//
//    for (String s: st) {
//      Integer  i=map.get(s);
//      if(i==null){
//          map.put(s,1);
//      }else{
//        map.put(s,++i);
//      }
//    }
//    System.out.println(map);

    //昨天晚上第二题
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    System.out.println("请输入数据:");
    String sc = scanner.nextLine();//一次性输入好几个单词
    //System.out.println(sc);
    //wqqsadajskh , asdas .  uiwkj - daslknm = asq  +  wqqw

    char[] ch=sc.toCharArray();

    int index=-1;
    String  str="";

    for (int i = 0; i < ch.length; i++) {
        if(Character.isLetter(ch[i])) {
          index=i;
          str+=ch[i];
        }else{
          if(index!=-1) {
            index=-1;
            list.add(str);
            str="";
          }
        }
        if(i==ch.length-1){
          list.add(str);
        }
    }

    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
      }
    });
    System.out.println(list);
  }
}
