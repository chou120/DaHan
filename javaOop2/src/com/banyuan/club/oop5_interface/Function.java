package com.banyuan.club.oop5_interface;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 10:28 上午
 */
public interface Function {
    //在jdk1.8之前接口里面都是抽象方法  jdk1.8之后（包括1.8） 可以有普通方法
    public   abstract  boolean   login(String name,String password);

    public  static  final String COUNTRY="中国";

    //接口里面只有常量
    //接口继承接口意义不大
    //接口不可以被实例化  抽象类也不可以实例化
    //接口可以单继承 也可以多继承    java只支持单继承

        void  test();//   笔试题这种写法没错


  // 老师:姓名 年龄 吃饭 数据
  //学生同上
  /*
      由于共性  提取出一个公共的类
      现在 学生变坏了    学会抽烟了
      老师也变坏了  在外面找小三
   */


   public default  void  show(){

  };


}
