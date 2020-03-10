package com.banyuan.test;

import com.banyuan.oop5.Person;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 3:24 下午
 */
public class Tool {

  /*
    //1.增加对象
    //2.根据名字删除指定对象
    //3.根据名字来修改对象信息
    //4.根据名字来查询具体的对象的信息

   */

  /**
   *
   * 在Elephant中增加一个静态成员，统计被创建出来的大象对象的数量，私有化这个静态成员，提供静态的get和set方法
   * 在Elephant中增加一个静态成员，计算大象对象的平均身高，私有化这个静态成员，提供静态的get和set方法
   */


  public static  Person[] person=new  Person[10];  //被static修饰的数据是静态的  能被所有的 类对象  共享
  public static int count=0;  //被static修饰成员 属于  类(class文件)  不属于对象


  //增加
    public static  void  addPerson(Person  per){
      person[count]=per;
      count++;
    }

  //删除
    public static void  delPerson(String  name){
      if(count==0){
        return;
      }
      //找到要删除数据的位置
      int  index  =-1;
      for (int i = 0; i < count; i++) {
          if(person[i].getName().equals(name)){
            index=i;
            break;  //默认对象的名字数据不一样
          }
      }
      for(int  i=index;i<count;i++){
        person[i]=person[i+1];
      }
      count--;
    }

  //修改
  public static void  updatePersonByName(String  name,int  age) { //根据名字修改其年龄
    //找到满足条件的
    for (int i = 0; i < count; i++) {
      if (person[i].getName().equals(name)) {
        person[i].setAge(age);
        break;
      }
    }
  }
//  public  String show(){
//      return  "你好";
//  }
  //查找
  public  static Person   selectByName(String  name){
    for (int i = 0; i <count; i++) {
      if(person[i].getName().equals(name)){
        return    person[i];
      }
    }
    return   null;//不满足条件  返回null 也就是对象不在
  }


  public static   void   showInfo(){
    for (int i = 0; i <count; i++) {
      System.out.println(person[i].toString());
    }

  }



}
