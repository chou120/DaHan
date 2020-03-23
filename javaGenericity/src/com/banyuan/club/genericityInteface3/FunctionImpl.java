package com.banyuan.club.genericityInteface3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 2:30 下午
 */
public class FunctionImpl<T>  implements Function<T> {

  List<T> list=new ArrayList<>();

  @Override
  public void add(T t) {
    list.add(t);
  }

  @Override
  public boolean delete(T t) {
    for (int i = 0; i <list.size(); i++) {
      if(list.contains(t)){
        list.remove(i);
        return  true;
      }
    }
    return false;
  }

  @Override
  public T queryByT(T t) {
    for (int i = 0; i <list.size(); i++) {
      if(list.contains(t)){
        return  list.get(i);
      }
    }
    return null;
  }

  @Override
  public T update(T t) {
    return null;
  }
}
