package com.banyuan.homework2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/11 9:31 上午
 */

import com.sun.javaws.IconUtil;
import java.util.Scanner;

/**
 * 现有
 * 学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）
 * 试题类（试题编号number,试题内容title,试题选项 anwserA  anwserB anwserC anwserD  试题答案  Anwser）
 * 要求:
 * 其中一个学生（有6个）登录账号进行考试,在控制台随机显示10个题目,并且输入题目的正确答案才会有分数,
 * 每题10分,现在有30个题目(题目自己出,不做要求)。
 * 求学生考完试在控制台最终得到的分数
 */

public class TestExam {

  public static void main(String[] args) {
      // 学号   姓名   password
    Scanner  sc=new Scanner(System.in);
    System.out.println("请输入学号:");
    String   number=sc.next();
    System.out.println("请输入姓名:");
    String   name=sc.next();

    boolean   flag=Util.login(name, number);
    if(flag){
        Util.exam();
        int   score=0;
      for (int i = 0; i <Util.question_index.length; i++) {
          //显示随机出来的题目
        System.out.println(Util.questions[Util.question_index[i]].toString());
        System.out.println("请输入您的答案:");
        String   an=sc.next();
        if(an.equals(Util.questions[Util.question_index[i]].getAnswer())){
          score+=10;
        }
      }
      //把得到的分数塞进学生对象
      for (int i = 0; i < Util.students.length; i++) {
        if(Util.students[i].getStuName().equals(name)){
          Util.students[i].setStuScore(score);
        }
      }

      for (int i = 0; i < Util.students.length; i++) {
        System.out.println(Util.students[i].toString());
      }






    }else{
      System.out.println("小伙子,你盗号呢？....");
    }


  }
}
