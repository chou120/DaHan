package com.banyuan.club.genericityInteface2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 2:06 下午
 */
public interface Function {

  //对集合数据做增删该差操作

  void  add(Person  p);

  boolean delete(String  name);

  void    update(String  name);


  //查询  如果集合里面包含这个对象那么就继续下一步操作
  Person   queryByData(Person  person);


}
