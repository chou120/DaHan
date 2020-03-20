package com.banyuan.club.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/19 1:58 下午
 */
public class SetDemo {

  public static void main(String[] args) {
    Set  set=new HashSet();//没有重复元素   最多只有一个空元素  存放的元素是无序的

    set.add("李四");
    set.add("王五");
    set.add("战三咖");
    /* 为什么在少量数据的时候 set无序的特性表现不出来...? 因为底层的存储 在某个存储空间内  刚好数据的存储位置一致
    *   当set集合里面的数据越来越多的时候   set无序的特性才会显示出来
    *  */

//    set.add(null);
//    set.add(56);
//    set.add("战三咖");
//    set.add("哈哈啥");/**/
//    set.add(45.67);
//    set.add(null);

    set.add(new Person("老李", 36));
    set.add(new Person("老林", 40));
    set.add(new Person("老李", 36));



    //System.out.println(set);

//    for (Object obj:set) {
//      System.out.println(obj);
//    }

    /**
     * for(集合或者是数组里面的元素的数据类型   变量名:集合名或者是数组名){
     *    System.out.println(变量名);
     * }
     *
     */

     // Object []  obj=set.toArray();

//    String [] string={"赵一帆","韩朝"};
//
//    for (String ob:string) {  //增强 for 底层的原理就是  迭代器  Iterator
//      System.out.println(ob);
//    }

//    Person [] per=new  Person[2];
//    per[0]=new Person("老李", 36);
//    per[1]=new Person("老李1", 37);
//
//    for (Person   p: per) {
//      System.out.println(p.getName());
//    }


    /*
      假设 如果让你 去设计一个人员信息的统计  程序 你如何设计 ？
      身份证是保证 人员是否只有一个的 标志

     */



    LinkedHashSet  linkedHashSet=new LinkedHashSet();
        /*
            底层存储：链表 保证数据的顺序
                    hash表 保证数据的唯一
         */
    linkedHashSet.add("你好1");
    linkedHashSet.add("你好2");
    linkedHashSet.add("你好2");
    linkedHashSet.add("你好4");
    linkedHashSet.add(true);
    linkedHashSet.add("你好5");


   // System.out.println(linkedHashSet);

    TreeSet  treeSet=new TreeSet(); //底层的存储是以 平衡树(红黑树)存储原理进行数据存储


//    treeSet.add("周日");
//    treeSet.add("周二");
//    treeSet.add("周一");
//    treeSet.add("周六");
//    treeSet.add("周四");
//    treeSet.add("周五");

    /*
        根据年龄进行排序   得到最终输出的结果
        如果年龄一样  那么就根据字母的先后顺序输出
     */
    treeSet.add(new Person("张三", 34));
    treeSet.add(new Person("李四", 27));
    treeSet.add(new Person("王五", 31));
    treeSet.add(new Person("赵三", 24));

    //TreeSet集合已经实现了平衡树   你只需要要数据放进去  或者是要比较的条件放进去



    for (Object  obj:treeSet) {
      Person  p=(Person)obj;
      System.out.println(p);
    }



  }
}
