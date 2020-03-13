package com.banyuan.club.oop6;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 11:20 上午
 */
public class TestEnum {

  public static void main(String[] args) {
    Day    day=Day.SUNDAY;
    System.out.println("--------"+day);
    switch (day){
      case SUNDAY:
        System.out.println("today is SUNDAY");break;
      case MONDAY:
        System.out.println("today is MONDAY");break;

      case TUESDAY:
        System.out.println("today is TUESDAY");break;
      case FRIDAY:
        System.out.println("today is FRIDAY");break;
      case SATURDAY:
        System.out.println("today is SATURDAY");break;

      case WEDNESDAY:
        System.out.println("today is WEDNESDAY");break;

      case THURSDAY:
        System.out.println("today is THURSDAY");break;
    }

//    for (int i = 0; i <Day.values().length; i++) {
//      System.out.println(Day.values()[i]);
//
//    }

    System.out.println(Day.FRIDAY.ordinal()); //获取枚举类里面常量的索引





  }


}
