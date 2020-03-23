package com.banyuan.club.genericityInteface3;

import com.banyuan.club.genericityInteface2.Person;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 2:36 下午
 */
public class TestFunction {

  public static void main(String[] args) {
    Function<Person>  function=new FunctionImpl();

    function.add(new Person("张三", "下水道..."));
    function.add(new Person("张三1", "下水道1..."));
    function.add(new Person("张三2", "下水道2..."));
    function.add(new Person("张三3", "下水道3..."));


    Person p=function.queryByT(new  Person("张三","下水道..."));

    if(p!=null){
      System.out.println("存在这个数据..");
    }else{
      System.out.println("您查询的数据不存在");
    }

    Function<String>  function1=new FunctionImpl<>();
    function1.add("闫正池1");
    function1.add("闫正池2");
    function1.add("闫正池3");
    function1.add("闫正池4");

    String   str=function1.queryByT("闫正池1");
    if(str!=null){
      System.out.println("存在这个数据..");
    }else{
      System.out.println("您查询的数据不存在");
    }




  }


}
