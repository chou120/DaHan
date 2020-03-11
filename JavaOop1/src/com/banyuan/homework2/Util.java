package com.banyuan.homework2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/11 9:38 上午
 */
public class Util {

  //学生对象存储
  public static Student[] students = new Student[6];
  public static Question[] questions = new Question[30];
  public static String[] answerStr = {"A", "B", "C", "D"};//
  public static int[] question_index = new int[10];

  static {
    //在程序启动的时候   6个学生的对象就已经被初始化了
    for (int i = 0; i < students.length; i++) {
      Student student = new Student();
      student.setStuName("张三" + i);
      student.setStuNum("952" + i);
      student.setStuGrade(3);
      students[i] = student;
    }

    //题目也被初始化了
    for (int i = 0; i < questions.length; i++) {
      Question question = new Question();
      question.setNumber(i + 1);
      question.setTitle("第" + (i + 1) + "遍提问:老周真帅!!!");
      //  A B C D

      int index = (int) (Math.random() * answerStr.length);

      question.setAnswer(answerStr[index]);//随机给答案
      questions[i] = question;

    }
    for (int i = 0; i < question_index.length; i++) {
      question_index[i] = -1;
    }


  }


  //学生登录的方法
  public static boolean login(String stuName, String stuNumber) {

    for (int i = 0; i < students.length; i++) {
      if (students[i].getStuName().equals(stuName)
          && students[i].getStuNum().equals(stuNumber)) {
        System.out.println("欢迎" + stuName + "登录");
        return true;
      }
    }
    return false;
  }

  //登录成功之后直接进入考试
  public static void exam() {
  int  count=1;
    for (int i = 0; i <question_index.length; i++) {
        //生成十个随机数
       int index = (int) (Math.random() * students.length);
        //先不考虑随机下标一样
       question_index[i]=index;


    }



    //使用随机数 得到 是个题目
//    int count = 0;
//    for (int i = 0; i < students.length; i++) {
//
//      //为了防止下标重复
//      for (int j = 0; j < question_index.length; j++) { //10
//
//        //随机问题的下标
//        int index = (int) (Math.random() * students.length); //循环十次
//        int  key=0;
//
//        while(key<= count) {
//
//          if (index != question_index[key]) {
//            if(key==count){
//              question_index[count++]=index;
//              System.out.println("----"+index);
//              break;
//            }
//            key++;
//          }else{
//            break;
//          }
//
//        }
//
//      }
//    }

  }


}
