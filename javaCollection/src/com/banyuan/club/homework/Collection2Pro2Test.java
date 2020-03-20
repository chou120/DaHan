package com.banyuan.club.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.plaf.basic.BasicBorders.MarginBorder;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 9:38 上午
 */
public class Collection2Pro2Test {

  /*
    2.某班级有 40 个学生，学号为 180201-180240，全部参加 Java 集合阶段检测，
    给出所有同学的成绩（可随机产生，范围为 50-100），
    请编写程序将本班各位同学成绩从高往低排序打印输出，
    注：成绩相同时学号较小的优先打印要求：
    打印的信息包含学号、姓名（姓名统一为“同学 J”[J=10,11,12。。。]）和成绩

   */
  public static void main(String[] args) {

  List set=new ArrayList();

    for (int i = 1; i <=40; i++) {
      Stu  stu=null;
      int score=(int) (Math.random()*51+50);  //Math.random() 表示0~1之间 但是 包括0 [0,1)
      if(i<=9){
        stu=new Stu("18020"+i,"同学"+i,score);
        set.add(stu);
      }else{
        stu=new Stu("1802"+i,"同学"+i,score);
        set.add(stu);
      }
    }
        //Comparable 内部比较器
//    Collections.sort(set, new Comparator() {   //外部比较器
//      @Override
//      public int compare(Object o1, Object o2) {
//          Stu  st1=(Stu)o1;
//          Stu  st2=(Stu)o2;
//
//          int  num=st2.getScore()-st1.getScore();
//          int   num2=  num==0 ? Integer.valueOf(st1.getStuNum())-Integer.valueOf(st2.getStuNum()) :num;
//        return num2;
//      }
//    });

    Collections.sort(set,new MyComparator());



    for (Object  obj:set) {
      System.out.println(obj);
    }

  }


}
