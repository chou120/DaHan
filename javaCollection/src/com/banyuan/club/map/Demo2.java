package com.banyuan.club.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 1:55 下午
 */
public class Demo2 {

  public static void main(String[] args) {
    //现在有三个班级  每个班级三个人
    //现在想要把所有人的信息按一下格式输出
    /*
        班级1:
          学生信息
        班级2:
          学生信息
            ...
     */
    Map map = new HashMap<>();


    map.put("班级3", "");

    List  list=new ArrayList();
    list.add(new Person("王五"));
    list.add(new Person("王五2"));
    list.add(new Person("王五3"));
    map.put("班级1", list);

    list=new ArrayList();
    list.add(new Person("王4"));
    list.add(new Person("王45"));
    list.add(new Person("王43"));

    map.put("班级2", list);

    list=new ArrayList();
    list.add(new Person("王八"));
    list.add(new Person("王4⑧"));
    list.add(new Person("王🦍"));

    map.put("班级3", list);


   Set set= map.keySet();
    for (Object obj:set) {
      System.out.println(obj);
      System.out.println(map.get(obj));  //得到是是一个集合

    }

    System.out.println("------------------");

    Hashtable  hashtable=new Hashtable();
//    hashtable.put("哈哈哈",null);
//
//    System.out.println(">>>>"+hashtable);

    /**
     * Hashtable 和 HashMap的区别：
     *  前者不支持键值对为null 否则空指针异常
     *      前者是线程安全的 效率低
     *      后者线程不安全  效率高
     *
     * HashMap的实现原理
     *          key  value     底层是hash表
     *  java.util.concurrent.ConcurrentHashMap
     */





  }

}
