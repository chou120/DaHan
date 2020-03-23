package com.banyuan.club.genericityClass;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 11:28 上午
 */
public class Point<T,K> {

//  private Object  object;
//
//  public Object getObject() {
//    return object;
//  }
//
//  public void setObject(Object object) {
//    this.object = object;
//  }
//
//  @Override
//  public String toString() {
//    return "Point{" +
//        "object=" + object +
//        '}';
//  }

  private  T   data;

  private  K   KData;

  public K getKData() {
    return KData;
  }

  public void setKData(K KData) {
    this.KData = KData;
  }

  public T getData() {
    return data;
  }



  public void setData(T data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Point{" +
        "data=" + data +
        ", KData=" + KData +
        '}';
  }
}
