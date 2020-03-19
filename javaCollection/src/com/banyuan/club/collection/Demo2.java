package com.banyuan.club.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/18 10:48 上午
 */
public class Demo2 {

  public static void main(String[] args) {
    Collection collection = new ArrayList();
    collection.add("闫正池");
    collection.add("韩朝");
    collection.add(5.67);
    collection.add('a');
    collection.add(56);
    collection.add(true);

    Collection collection2 = new ArrayList();
//    collection2.add("闫正池");
//    collection2.add("韩朝");
//    collection2.add(5.67);


    collection.retainAll(collection2); //求集合的交集  并且把交集的结果赋值给前者

    System.out.println(collection);
    System.out.println(collection2);







  }

}
