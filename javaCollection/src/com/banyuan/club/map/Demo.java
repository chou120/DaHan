package com.banyuan.club.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 1:39 下午
 */
public class Demo {

  public static void main(String[] args) {
   // Map map=new HashMap();//是以键值对的方式存储数据  map集合的Key是唯一的
    Map  map=new HashMap();
    map.put(12, 12);
    map.put("你", 12);
    map.put(true, 12);
    map.put("", 12);
    map.put(12.3, 12.3);
    map.put(12.3, 8888);
    map.put(45, "测试");

    map.put(null, "sa");
    map.put("洒水", null);

    map.put(new Person("李四"), new Person("李四老婆"));
    map.put(new Person("李四"), new Person("李四小老婆"));

   // System.out.println(map);

    Map  map2=new HashMap();
    map2.put("张三", 115);
    map2.put("王麻子", 11);
    map2.put("赵老二", 13);
//    System.out.println(map);
//
//    System.out.println(map.get("")); //通过键获取相应的值
//    System.out.println(map.remove(12.3));

     //map.putAll(map2);

   // System.out.println(map);

    Collection con=map.values();//获取map集合里面 所有的值
    //System.out.println(con);

    //输出方式如下  key=value
    //            key1 = value1

    Set  set=map.keySet();//map集合的键不能用迭代器    应为 键不是有序的

    for (Object  obj:set) {
      System.out.println("键为:"+obj+",值为:"+map.get(obj));
    }

    map.containsKey("12");

  }


}
