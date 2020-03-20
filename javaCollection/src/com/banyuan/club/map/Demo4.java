package com.banyuan.club.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 2:31 下午
 */
public class Demo4 {

  public static void main(String[] args) {
    Map map = new LinkedHashMap<>();
    /*
      存储数据的方式  由链表和哈希表组成
        链表保持键的有效顺序  (key)
        哈希表保证数据的唯一  (key)
     */

    map.put("沾上干2", 122121);
    map.put("沾上干43", 122121);
    map.put("2沾2上干2", 122121);
    map.put("321沾上干", 122121);
    map.put("沾32上干", 122121);
    map.put("沾上干2", 122121);

    // System.out.println(map);
    Object obj = map.replace("沾上干2", "大保健");
    System.out.println(map);
    System.out.println("----" + obj);  //返回的是替换了的数据


  }

}
