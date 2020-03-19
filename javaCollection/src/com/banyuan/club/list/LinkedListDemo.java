package com.banyuan.club.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/19 11:13 上午
 */
public class LinkedListDemo {


  public static void main(String[] args) {
//
//    LinkedList list = new LinkedList();  //底层存储是链表  查询慢  增删快   线程不安全  效率高
//    list.add("沾上干1");
//    list.add("沾上干2");
//    list.add("沾上干3");
//    list.add("沾上干4");
//    list.add("沾上干5");
//    list.add("沾上干6");
//
//    System.out.println(list.peek());
//    System.out.println(list.peek());
//    list.offerFirst("你好");  //
//    list.offer("大棒子");  //    格式化 option+command+L
//    list.addFirst("哈哈哈哈");
//    System.out.println(list);
//
////        list.addLast("小棒子");
////        list.addFirst("哈哈哈哈");
//
//    //list.clear();
//
//    System.out.println(list.poll());
//    System.out.println(list.poll());  //删除链表的第一个数据
//    System.out.println(list);
//
//    System.out.println(list.pop()); //弹出  跟上面方法一样
//
//    System.out.println(list);
//
//    list.push("你好1");
//    list.push("你好2");
//    list.push("你好3");
//    list.push("你好4");
//    list.push("你好5");
//
//    System.out.println(list);
//    System.out.println(list.pop());


    Vector vector=new Vector();  //底层存储是数组  增删慢 查询快  synchronized安全  效率低
    vector.addElement("数据1");
    vector.add("数据2");
    vector.add("数据3");

    vector.setElementAt("马大哈", 1);

    vector.insertElementAt("大保健", 1);

    System.out.println(vector.capacity());

    Object [] o=new Object[vector.size()];
    vector.copyInto(o);
    System.out.println(vector);

    for (Object  obj:o) {
      System.out.println(obj);
    }


  }


}
