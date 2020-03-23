package com.banyuan.club;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 11:19 上午
 */
public class Person<T>  implements  Comparable<T>{


  private  String  name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(T o) {
    return 0;
  }
}
