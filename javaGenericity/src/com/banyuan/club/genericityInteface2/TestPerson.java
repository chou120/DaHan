package com.banyuan.club.genericityInteface2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 2:17 下午
 */
public class TestPerson {

  public static void main(String[] args) {
    Function  function=new FunctionImpl();

    function.add(new Person("张三","小摔倒"));
    function.add(new Person("张三1","小摔倒1"));
    function.add(new Person("张三2","小摔倒4"));
    function.add(new Person("张三3","小摔倒2"));
    function.add(new Person("张三4","小摔倒3"));


    boolean   flag=function.delete("张三");
    System.out.println(flag);
//    flag=function.delete("张三");
//    System.out.println(flag);

    //function.add("你好啊");//对于已经指定了集合里面元素的类型 其他的类型不能调用相应的方法进行操作


  }

}
