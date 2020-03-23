package com.banyuan.club.genericityMethod;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 1:47 下午
 */
public class Point<K,V> {

  K x;
  V y;

  public Point() {
  }

  public Point(K x, V y) {
    this.x = x;
    this.y = y;
  }

  public K getX() {
    return x;
  }

  public void setX(K x) {
    this.x = x;
  }

  public V getY() {
    return y;
  }

  public void setY(V y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "Point{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }

}
