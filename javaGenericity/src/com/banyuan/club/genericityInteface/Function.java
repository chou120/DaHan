package com.banyuan.club.genericityInteface;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 1:56 下午
 */
public interface Function<T> {

  T   select(T  t);

  void  add(T  t);
}
