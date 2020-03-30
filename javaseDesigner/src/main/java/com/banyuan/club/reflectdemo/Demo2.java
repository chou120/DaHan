package com.banyuan.club.reflectdemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 3:16 下午
 */
public class Demo2 {

  public static void main(String[] args)
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    //我给你ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现呢
    ArrayList<Integer> list = new ArrayList<>();
    //list是不是只能存放整形数据

    Class clazz = list.getClass();  //泛型擦除

    Method method = clazz.getDeclaredMethod("add", Object.class);
    method.invoke(list, "张三");
    System.out.println(list.toString());

  }
}
