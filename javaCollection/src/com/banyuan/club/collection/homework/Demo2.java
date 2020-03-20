package com.banyuan.club.collection.homework;

import com.banyuan.club.homework.Stu;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/20 10:38 上午
 */
public class Demo2 {
  /*
    9.有一个学生类Student   学生编号，学生姓名，现在对学生仓库做增删改查操作
    学生每次被添加  该学生的学号自加1   如 9527   9528  等等

   */
  public static void main(String[] args) {
    Student  student=new Student("王五");
    StuTool.addStu(student);
    student=new Student("王五2");
    StuTool.addStu(student);
    student=new Student("王五3");
    StuTool.addStu(student);

    System.out.println(StuTool.delStuByStuNum(9528));


    List  list=StuTool.show();
    for (Object obj:list) {
      System.out.println(obj);
    }


  }

}
class  StuTool{
  private  static List  list=new ArrayList();
  private  static  Integer STU_NUM=9527;
  private  StuTool(){}

  //添加学生
  public static void  addStu(Student  student){
      student.setStuId(STU_NUM++);
      list.add(student);
  }

  //删除学生
  public  static  boolean delStuByStuNum(Integer num){
      //list集合里面不是有一个
       int index= queryByNum(num);
        if(index==-1){
          return false;
        }
    list.remove(index);
    return true;
  }

  //查询出这个对象的下标
  public static Integer  queryByNum(Integer num){
    for (int i = 0; i <list.size(); i++) {
      Student  student=(Student) list.get(i);
        if(num.equals(student.getStuId())){  //用的都是包装类 数值这里不能直接使用 ==号判断
            return   i;
        }
    }
      return  -1;
  }

  //为了方便修改功能  因为如果要进行某个数据的修改   你首先要查到这个数据再什么位置  然后在来修改
    
  //根据名字查询 得到数据



  //输出集合里面的数据
  public  static  List show(){
    return list;
  }

}