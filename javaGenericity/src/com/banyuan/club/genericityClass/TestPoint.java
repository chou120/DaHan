package com.banyuan.club.genericityClass;

import com.banyuan.club.Person;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 11:31 上午
 */
public class TestPoint {

  public static void main(String[] args) {

    Point<Person> point = new Point();
    Person p = new Person();
    p.setName("王五");
    point.setData(p);

    System.out.println(point.getData().getName());

    //泛型类如果接受的是两个参数呢？


  }

}
