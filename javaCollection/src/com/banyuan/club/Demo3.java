package com.banyuan.club;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/18 10:51 上午
 */
public class Demo3 {


  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("张三");
    list.add("李四");
    list.add("田七");
    list.add("王五");
    list.add("赵六");
    list.add("田七");

    list.add(1, "杨八妹");  //添加到指定的位置
//    for (int i = 0; i <list.size(); i++) {
//          Object  obj=list.get(i);
//      System.out.print(obj+" ☆ ");
//    }
//    System.out.println();
    list.remove(1);
    Object obj = list.set(1, "杨六郎");//相当于把原有的值挤出来了
    int  index=list.indexOf("田七");  //只会找一次

    index=list.lastIndexOf("田七");   // 因为 ArrayList  底层是数组存储的  数组可以通过下标来进行操作

    //System.out.println(index + "-----" + list.toString());

    ListIterator li= list.listIterator(); //连续 存储   只要知道其中一个数据  是不是就能找到其他的

//    li.add("大保健");
//    li.add("大保健2");

//      while(li.hasNext()){
//        System.out.println(li.next()+"---"+li.nextIndex());
//      }//因为循环已经结束  游标已经到最后
     // li.remove();  //从最后一个往前移除     刚开始的时候  游标在 集合的第一个位置  只有等游标到最后一个位置才可以往回移除

    System.out.println(">>>>>>>>>>>>>>>");

      while(li.hasPrevious()){  //鸡肋的方法
        System.out.println(li.previous()+"   "+li.previousIndex());
      }

  // System.out.println("-----" + list.toString());






  }


}
