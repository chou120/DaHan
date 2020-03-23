package com.banyuan.club.genericityInteface3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 2:27 下午
 */
public interface Function<T> {

  //
  void   add(T  t);

  //删除
  boolean  delete(T  t);

  //查询
  T    queryByT(T   t);

  //修改
  T  update (T  t);


}
