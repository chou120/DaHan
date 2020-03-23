package com.banyuan.club.test;

import com.banyuan.club.Person;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 4:04 下午
 */
public class Util {

  public  static  void  show(Pair<?  extends  Employ> p){
    System.out.println(p.getT());
  }
//  public  static  void  show2(Pair<Manager> p){
//    System.out.println(p.getT());
//
//  }


   public  static  void  show2(Pair<?  super Manager> p){


   }


  public static  <T extends  Comparable<T>>  T min(T[] a){

    return  a[0];
  }



}
class  Demo{

  public static void main(String[] args) {

    Person[] myUtils=new  Person[2];


    Util.min(myUtils);



    Pair<Manager>  employPair=new Pair<>();
    Util.show(employPair);

    Pair<? extends Employ>  em=employPair; // ok
    em.getT();


    Pair<? super Manager> e=employPair;
    e.setT(new Manager());

    e.getT();//Object

    Util.show2(e);



  }
}