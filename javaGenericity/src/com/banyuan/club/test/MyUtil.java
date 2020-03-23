package com.banyuan.club.test;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 4:17 下午
 */
public class MyUtil<T>  implements  Comparable<T>{

  @Override
  public int compareTo(T o) {
    System.out.println("Comparable...");
    return 0;
  }
}
