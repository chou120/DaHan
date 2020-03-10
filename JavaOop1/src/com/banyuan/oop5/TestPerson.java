package com.banyuan.oop5;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 1:37 下午
 */
public class TestPerson {

  public static  Person[] person=new  Person[10];  //被static修饰的数据是静态的  能被所有的 类对象  共享
  int   number;
  static int count=0;  //被static修饰成员 属于  类(class文件)  不属于对象

  /**
   * static  关键字
   * @param args
   *
   * class文件只会被加载一遍
   *
   * class文件在内存中加载的时候   被static 修饰的成员立即加载    static修饰的成员叫  类成员
   *
   *  static  修饰的成员 优先于对象存在、
   *
   *  static  修饰的成员被所有的对象共享
   *
   *  静态的方法只能调用静态成员
   *
   *  非静态的可以任意调用
   *
   */


  public static void main(String[] args) {
    //以对象数组作为一个存储的容器
    //1.增加对象
    //2.根据名字删除指定对象
    //3.根据名字来修改对象信息
    //4.根据名字来查询具体的对象的信息

    //以对象数组作为一个数据存储  其他的类只能对这个容器里面数据 操作 请问  怎么办？


    // 增加对象
    person[0]=new  Person("张三",34,"中国");
    count++;
    person[1]=new  Person("张三2",334,"中国");
    count++;
    person[2]=new  Person("张三3",33,"中国");
    count++;

    //   删除  得到满足的对象的数组的下标
    int   index=-1;
    for (int i = 0; i < count; i++) {
      if(person[i].getName().equals("张三")){ //字符串的比较是否一样
          index=i;
          break;
      }
    }
    for (int i =index; i < count; i++) {
        person[i]=person[i+1];

    }
    //删除之后  count应该 -1
    count--;
    for (int i = 0; i <count; i++) {
      System.out.println(person[i].toString());
    }

    //调用工人的方法
      Worker  worker=new Worker();
      worker.findPerson(35);

    //修改


    //查询


  }
  public  static  void   show(){
    // 也要对对象里面的数据进行操作
    System.out.println(person[0].getName());


  }











}
