package com.banyuan.club;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/9 上午10:47
 */

public class TestDemo {

  //  一个java程序是由很多 java文件以及相关的插件组成
  //  java文件之间方法的相互调用（或者是成员的相互调用）
  // 其他的java文件中如果有本java文件需要的成员 我们可以直接去调用  而不需要再写一遍


  public static void main(String[] args) {

    //调用  Demo里面的成员变量  和 成员方法  如何去调用
    //  公式:  类名   变量名（对象名）=new   类名();   int[] arr=new  int[2];
    Demo    demo=new  Demo();//给  目标类创建一个对象
    //调用成员   变量名.成员
    String  name=demo.username;
    System.out.println("demo成员变量的name叫:"+name);

    demo.show();

    Demo  demo2=new  Demo(); // 想给 demo2的对象的username改名字
    demo2.username="王二狗";
    System.out.println(demo2.username);
    System.out.println(demo2.address);

    Demo  demo3=new  Demo();
    //demo  demo2  demo3三个对象的创建  使用的 是不是同一个java文件
    System.out.println("------"+demo3.username);


    // 请问  demo  demo2  demo3  是不是同一个对象  ？ 不是同一个对象
    //类    变量  方法



  }
}
