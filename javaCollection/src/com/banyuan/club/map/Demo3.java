package com.banyuan.club.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 2:12 下午
 */
public class Demo3 {

  public static void main(String[] args) {

//    TreeMap treeMap = new TreeMap();  // 根据键自然排序
//    treeMap.put(6, "展示给你");
//    treeMap.put(7, "展示给你");
//    treeMap.put(2, "展示给你");
//    treeMap.put(1, "展示给你");
//    treeMap.put(4, "展示给你");
//
//    System.out.println(treeMap);

    TreeMap treeMap = new TreeMap(new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        Person person1=(Person)o1;
        Person person2=(Person)o2;
        int num=person1.getName().length()-person2.getName().length();
        int num2=  num==0 ?person1.getName().compareTo(person2.getName()):num;
        return num2;
      }
    });

    treeMap.put(new Person("dasdwssasw"), "抠脚大汉");
    treeMap.put(new Person("asdaws"), "抠脚大汉2");
    treeMap.put(new Person("fefqda"), "抠脚大汉3");
    treeMap.put(new Person("basdwssasw"), "抠脚大汉4");

    System.out.println(treeMap);



    treeMap=new TreeMap();
    List array=new ArrayList<>();
    array.add(5343);
    array.add(2);
    array.add(343);
    array.add(53);
    array.add(51);
    array.add(21);

    for (Object  ob:array) {
      treeMap.put(ob, 9);
    }


    System.out.println(treeMap);






  }


}
