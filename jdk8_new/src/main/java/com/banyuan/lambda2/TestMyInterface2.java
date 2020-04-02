package com.banyuan.lambda2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 3:28 下午
 */
public class TestMyInterface2 {

  public static void main(String[] args) {
    List<Integer>  list=new ArrayList<>();
    list.add(42);
    list.add(4221);
    list.add(3221);
    list.add(212);
    list.add(4);

    MyInterface<Integer>  in= new  MyInterface<Integer>(){
      @Override
      public List<Integer> getValue() {

        List<Integer>  list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>100){
              list1.add(list.get(i));
            }
        }
        return list1;
      }
    };

    List<Integer>  li=in.getValue();
    for (Integer  i:li) {
      System.out.println(i);
    }

    //如何使用lambda表达式操作
    in=()-> {
      List<Integer> list1 = new ArrayList<>();
      for (int i = 0; i < list.size(); i++) {
        if (list.get(i) > 100) {
          list1.add(list.get(i));
        }
      }
      return list1;
    };


    li= in.getValue();

    for (Integer  i:li) {
      System.out.println(i);
    }



  }

}
