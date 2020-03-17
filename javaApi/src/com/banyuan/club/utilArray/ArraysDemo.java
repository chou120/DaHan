package com.banyuan.club.utilArray;

import java.util.Arrays;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/17 1:36 下午
 */
public class ArraysDemo {

  public static void main(String[] args) {

    int[] arr = {12, 3412, 412, 56, 13, 98};
    int[] arr1 = Arrays.copyOf(arr,arr.length+1); //之前让你们  数组扩容

    System.out.println( Arrays.equals(arr, arr1));

    System.out.println(Arrays.toString(arr));

    arr1=Arrays.copyOfRange(arr, 1, 3);//不包含最后一个

    //sort  自然升序排序
    Arrays.sort(arr,2,arr.length);

    for (int  array:arr) {
      System.out.println(array);
    }

    System.out.println(Math.abs(-1));

    System.out.println(Math.ceil(2.00001));

    






  }


}
