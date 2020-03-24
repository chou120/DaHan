package com.banyuan.club.homework;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/24 10:19 上午
 */
public class ArraySort<T  extends Number> {

  private  T[] arr;

  public ArraySort(T[] arr) {
    this.arr = arr;
  }

  public  T  getMin(){
    Arrays.sort(arr, new Comparator<T>() {
      @Override
      public int compare(T o1, T o2) {
        int num= Double.parseDouble(o1.toString())-Double.parseDouble(o2.toString())>0 ? 1:-1;
        return num;
      }
    });
    return  arr[0];
  }

}

class  Test{

  public static void main(String[] args) {
    Integer[]  in=new Integer[5];
    in[0]=120;
    in[1]=12131;
    in[2]=1112312;
    in[3]=1112;
    in[4]=99;

    Double[]  dou=new Double[4];
    dou[0]=145.63412;
    dou[1]=145.6321312412;
    dou[2]=3145.63412;
    dou[3]=45.634121231;



    ArraySort<Integer>  arraySort=new ArraySort<>(in);

    System.out.println(arraySort.getMin());


  }

}
