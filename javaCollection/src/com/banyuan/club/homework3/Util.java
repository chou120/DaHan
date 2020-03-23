package com.banyuan.club.homework3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 10:10 上午
 */
public class Util {

  private static List listStudent = new ArrayList(); //学生容器
  private static List listQuestions = new ArrayList(); //试题容器

  private static String [] str={"A","B","C","D"};
  private static Integer index=0;


  private Util() {

  }

  //程序刚开始在启动的时候试题容器里面已经有数据了
  static {
    for (int i = 0; i < 3; i++) {
      Student  stu=new Student("9527"+i,"张三"+i,"12345"+i,0.0);
      listStudent.add(stu);
    }

    for (int i = 0; i <20; i++) {

      listQuestions.add(new Questions(100+index++, "胡萝卜好吃吗"+i,"A.好吃"+i,"B.好吃"+i,
          "C.好吃"+i, "D.好吃"+i,str[(int)(Math.random()*str.length)]));
    }
  }



  public  static   Student  login(String uName,String password){

    for (int i = 0; i <listStudent.size(); i++) {
      Student  st=(Student) listStudent.get(i);
      if(uName.equalsIgnoreCase(st.getStuName()) && password.equalsIgnoreCase(st.getPassword())){
        //进行考试
          return st;
      }
    }
      return  null;
  }


  //登录成功 之后 直接进行考试  的方法
  public  static   List  questionList(){
    List  arr=new ArrayList();
    for (int i = 0; i <5; i++) {
      int  index=(int)(Math.random()*listQuestions.size());
      Object  obj=listQuestions.get(index);
      if(!arr.contains(obj)){
           arr.add(obj);
      }
    }
    return  arr;
  }


  //修改学生数据的方法
  public  static  Object  update(Student  student){
    for (int i = 0; i <listStudent.size(); i++) {
      if(listStudent.contains(student)){
        return  listStudent.set(i, student);
      }
    }
    return null;
  }



}
