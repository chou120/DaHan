package com.banyuan.club;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 11:18 上午
 */
public class Demo1 {

  public static void main(String[] args) {
    List<Person> list=new ArrayList<Person>();  //在编译的时候指定数据类型
//    list.add("渣渣辉");
//    list.add(45);
    list.add(new Person());

    List<Integer> list1=new ArrayList();
    Map<String ,Integer> map=new HashMap<>();


    //现在需要对集合里面的person对象进行操作  必须强转

    for (Object  obj:list) {
      Person  p=(Person)obj;  //此类操作会容易出现运行时异常  那么为了更方便的解决代码问题  可不可以把异常出现的时间提前
      System.out.println(p);
    }




  }



}
