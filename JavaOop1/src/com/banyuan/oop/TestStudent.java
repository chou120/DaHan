package com.banyuan.oop;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/9 上午11:10
 */
public class TestStudent {

  public static void main(String[] args) {

    Student  student=new  Student();//

    student.username="韩朝";
    student.age=12;
    student.height=5.6F;
    student.weight=120;

    student.eat();
    student.sleep();
    student.paoNiu();

    Student  student1=new Student();//
    student1.username="刘耀";
    student1.address="垃圾桶旁边...";
    student1.paoNiu();


    //
    Student  student2=new Student();
    System.out.println("输出结果是:"+student2.username);  //null
    System.out.println(student2.age);
    //如果成员变量没有给具体的值 那么在创建对象的时候计算机会给所有的成员属性 赋默认值


    //创建一个汽车   汽车：品牌  名字  长度  高度  类型  产地 ....
    // 汽车行为特征: 驾驶     制冷    放歌  等等...




  }

}
