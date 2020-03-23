package com.banyuan.club.genericityInteface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 1:57 下午
 */
public class FunctionImpl<T> implements Function<T> {

  //数据添加到集合里面
  List<T> list=new ArrayList<>();

  @Override
  public T select(T t) {
    for (int i = 0; i <list.size(); i++) {
      if(list.contains(t)){
         return list.get(i);
      }
    }
    return null;
  }

  @Override
  public void add(T t) {
        list.add(t);
  }
}
