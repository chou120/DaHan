package com.banyuan.club.homework;

import java.util.Arrays;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/24 9:23 上午
 */
public class GenericityTest<T extends Number> {

  private  T[] array;

  public GenericityTest(T[] array) {
    this.array = array;
  }

  //求泛型里面数据的最小值
  public  T  getMin(){
    T min=array[0];
    for (int i = 1; i < array.length; i++) {
      if(Double.parseDouble(array[i].toString())<Double.parseDouble(min.toString())){
          min=array[i];
      }
    }
      return  min;
  }
  public  T  getMax(){
    T max=array[0];
    for (int i = 1; i < array.length; i++) {
      if(Double.parseDouble(array[i].toString())>Double.parseDouble(max.toString())){
        max=array[i];
      }
    }
    return  max;
  }

  public Double   getAvg(){
    Double sum=0.0;
    for (int i = 0; i < array.length; i++) {
          sum=sum+array[i].doubleValue();
    }
    return   sum/array.length;
  }
}
class  TestGen{

  public static void main(String[] args) {
    Integer [] in=new  Integer[4];
    in[0]=12;
    in[1]=121329;
    in[2]=4;
    in[3]=1;
    GenericityTest<Integer> genericityTest=new GenericityTest<>(in);
   System.out.println(genericityTest.getMin());
//
    System.out.println(genericityTest.getAvg());

    System.out.println(genericityTest.getMax());




  }
}
