package com.banyuan.club.genericityMethod;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 1:40 下午
 */
public class Demo1{

  public  static <K,V>  void  show(Point<K,V> point){

    K  k= point.getX();
    V  v= point.getY();

    //  System.out.println(k+v);
  }

  public  static   void  show2(Point<Object,Object> point){

    Integer  k= (Integer)point.getX();
    Integer  v= (Integer)point.getY();

    System.out.println(k+v);
  }
  public  static   void  show3(Point<Object,Object> point){

    String  k= (String)point.getX();
    String  v= (String)point.getY();

    System.out.println(k+v);
  }


  public  static   void  show4(Point<?,?> point){  // 通配符 么有指定一个类型 所以在做操作的时候有限制

    System.out.println(point.x+ " " +point.y);
  }




  public  static   void  show5(Point<? extends Number,? extends  Number> point){  // 通配符 么有指定一个类型 所以在做操作的时候有限制

    Integer  number=(Integer)point.getX();
    Integer  number1=(Integer)point.getY();

    System.out.println(number+number1);

  }





  //给T一个类型接受限定
//  public    static <T extends Animal> void  show6(T t){
//
//
//
//  }



}
