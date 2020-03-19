package com.banyuan.club.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/18 9:28 上午
 */
public class Demo1 {

  /*
      数组 只能存放单一类型数据    并且长度一旦确定就不能变化

      集合:解决的数组的缺点  并且还有自身提供的一些方法 来对集合里面的数据进行方便操作
           存放各种数据类型的数据
           长度随着数据的多少进行变化

                 Collection

     List                            Set

ArrayList  LinkedList
Stack      Vector

   */


  public static void main(String[] args) {
    Collection collection = new ArrayList();
    collection.add("闫正池");
    collection.add("韩朝");
   // collection.add(5.67);
    //collection.add('a');
    //collection.add(56);
    //collection.add(true);
   // collection.add("");
    //collection.add(5.67);
    collection.add(new Person("张三", "123456"));

  //  System.out.println(collection.toString());
    //System.out.println();

    collection.remove(5.67);//默认的移除首先找到的数据  请问  后面一个5.67的位置变了没有
    System.out.println("---------"+collection);



//    Collection collection2 = new ArrayList();
//    collection2.add("闫正池2");
//    collection2.add("韩朝2");
//    collection2.add('b');
//    collection2.add(56.0);
//    collection2.add(true);
//
//     collection.addAll(collection2);
    //System.out.println(collection.toString());

    //collection.remove("韩朝");

    //collection.clear();
    //就目前的案例为什么不建议使用转换成对象数组进行输出



    //collection.removeAll(collection2);

//    System.out.println( collection.size());
//
//    System.out.println(collection.contains("韩朝"));
//


   // Object[] obj=collection.toArray();
    //如果在集合中存放数据之前不确定能具体存放什么数据   然后存放了很多类型的数据
    //将不建议使用  转换成对象数据  为什么  ？比如 我现在要输出  Person  的一个属性值

//    for (int i = 0; i <collection.size(); i++) {
//      Person   p=(Person)obj[i];//java.lang.ClassCastException: java.lang.String cannot be cast to com.banyuan.club.Person
//      System.out.println(p.getUsername());
//    }


//    Iterator it=collection.iterator();  //把集合所有的数据全部存入迭代器 让迭代器进行迭代输出
//    while(it.hasNext()){  //判断 迭代器里面有没有下一个元素
//      //  next  表示输出下一个元素 并且 有一个类似于指针的东西(游标) 移到下一元素
//      Object  obj=it.next();
//      System.out.println(obj);
//    }

//    for (Object  obj:collection) {
//      System.out.println(obj);
//    }
    /*
       增强for循环的底层原理就是  迭代器

     */





  }
}
