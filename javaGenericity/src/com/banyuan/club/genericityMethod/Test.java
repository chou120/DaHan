package com.banyuan.club.genericityMethod;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 1:51 下午
 */
public class Test {

  public static void main(String[] args) {

    Point<Integer,Integer> point=new Point<>();

    point.setX(12);
    point.setY(45);

    Demo1.show5(point);

  }


}
