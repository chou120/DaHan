package com.banyuan.oop5;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 1:49 下午
 */
public class Worker {
  //包工头

  //使用静态代码块的方式 来演示 static  修饰的成员 优先于对象存在

  static{
    System.out.println("我是 静态代码块...");
  }

  static  String name="沾上干";
  String  address="哈哈是";

  public   Worker(){
    System.out.println("我是无参构造器...");
  }

  public static  void  info(){
    //System.out.println(name+"----"+address);

  }



  public  void   test(){ //非静态的方法 可以任意访问
    System.out.println(name+"----"+address);
    findPerson(3);
  }




  public   void   findPerson(int  age){
    //首先是不是要得到对象数组的数据
    // 1.创建 TestPerson对象

    //如果是访问类的静态成员 不需要创建对象  只需要使用  类名.成员名
    Person[] p=TestPerson.person;

    System.out.println("...."+TestPerson.count);

    for (int i = 0; i < TestPerson.count; i++) {  //count值是  2
        if(p[i].getAge()<35){  // 假如说我只要一个
          System.out.println("我以及得到了你了:"+p[i].getName());
          break;
        }
    }


  }



}
