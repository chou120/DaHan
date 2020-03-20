package com.banyuan.club.homework;

import java.util.Comparator;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 10:13 上午
 */
public class MyComparator  implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
    Stu  st1=(Stu)o1;
    Stu  st2=(Stu)o2;

    int  num=st2.getScore()-st1.getScore();
    int   num2=  num==0 ? Integer.valueOf(st1.getStuNum())-Integer.valueOf(st2.getStuNum()) :num;
    return num2;
  }
}
