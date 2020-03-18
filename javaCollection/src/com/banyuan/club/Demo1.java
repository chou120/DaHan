package com.banyuan.club;

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

     List                       Set

ArrayList  LinkedList
Stack      Vector

   */


  public static void main(String[] args) {
    Collection collection = new ArrayList();
    collection.add("闫正池");
    collection.add("韩朝");
    collection.add('a');
    collection.add(56);
    collection.add(true);
    collection.add("");
    collection.add(5.67);
    collection.add(new Person("张三", "123456"));

    System.out.println(collection.toString());
    //System.out.println();

    Collection collection2 = new ArrayList();
    collection2.add("闫正池2");
    collection2.add("韩朝2");
    collection2.add('b');
    collection2.add(56.0);
    collection2.add(true);

     collection.addAll(collection2);
    System.out.println(collection.toString());

    collection.remove("韩朝");

    collection.clear();
    //就目前的案例为什么不建议使用转换成对象数组进行输出



    collection.removeAll(collection2);

    System.out.println( collection.size());


    System.out.println(collection.contains("韩朝"));




  }


}
