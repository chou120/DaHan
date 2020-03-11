package com.banyuan.oop6;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/11 1:35 下午
 */
public class Student   extends  Teacher{  //子类


  public  String  country="美国";
  String   city="佛罗里达";

  //现在需要借用 Teacher 类里面的 一些成员属性

//  public   void  show(){
//    //System.out.println("身份证号:"+IDCard+"---"+city+">>>"+country);
//    //System.out.println(name);
//  }

  public  Student(){
    super("zhangsan","下水道",34); //子类的构造器里面都有一个super(参数...) 一般情况下都会被隐藏起来
    //在构造器里面   super()处于第一
    System.out.println("我是子类构造器...");
  }

  //假设继承了父类的show

  //重写方法 发生在  继承中  并且是父类的方法满足不了自己的需求 那么可以进行对父类方法的重写
  public  void  show(){
    System.out.println("展示一下自己的魔鬼身材...");
  }


  //不想重写   想自己写一个方法 info()  但是没有考虑继承  到这一步  父类的show方法还是被继承了
//  public   void  info(){
//    System.out.println("展示一下自己的魔鬼身材...");
//  }

  //静态放属于 类   不属于任何一个对象



}
