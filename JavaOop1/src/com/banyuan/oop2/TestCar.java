package com.banyuan.oop2;

import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/9 下午1:35
 */
public class TestCar {

  public static void main(String[] args) {
//    Car car = new Car();
//    car.carBrand = "大奔";
//    car.carName = "大奔S300";
//    car.carType = "商务车";
//    car.carAddress = "🇨🇳";
//    car.carHeight = 1.8;
//    car.carLength = 3.1;
//
//    car.toString();
//
//    Car car1 = new Car();
//    car1.carBrand = "大奔";
//    car1.carName = "大奔100";
//    car1.carType = "家用车";
//    car1.carAddress = "🇨🇳";
//    car1.carHeight = 1.6;
//    car1.carLength = 2.8;
//
//
//    String str = car1.toString();
//    System.out.println("-----" + str);

    Car car = new Car();
    //car.carName = "提莫";
    //car.carLength = -4.5;//单位是米   请问是不是有问题？

    System.out.println(car.toString());//  代码的数据不能偏离实际
    //保证数据的正确性   是不是只能告诉计算机车长砸某个范围内有效？
    //  车长必须在 2~4.5米之间
/*
    Scanner  sc=new Scanner(System.in);
    System.out.println("请输入车长:");
    double  carLength=sc.nextDouble();
    if(carLength>=2.0&&carLength<=4.5){
      car.carLength=carLength;  //做个判断
    }
    System.out.println(car.toString());

    Car car2= new Car();
    System.out.println("请输入车长:");

    double  carLength2=sc.nextDouble();
    if(carLength2>=2.0&&carLength2<=4.5){
      car.carLength=carLength2;  //做个判断
    }
    System.out.println(car2.toString());*/

    Car  newCar=new Car();
    newCar.setCarLength(6);
    System.out.println(newCar.toString());

    newCar.setCarHeight(1.8);
   // newCar.carLength=-1.4;

    System.out.println(newCar.toString());



    //现在只想得到其中的一两个属性的信息
    //由于是隐藏起来的属性   并且咱们只想要其中的一两个的数据
    //System.out.println(newCar.carBrand);

    String  str=newCar.getCarName();//取货汽车名字数据
    System.out.println("汽车名字:"+str+",Brand:"+newCar.getCarBrand());

    newCar.setCarName("王二麻子");
    System.out.println(newCar.getCarName());


    //
    Car  car3=new Car();  // car3 在 栈中   new  Car();在堆中  car3引用的其实就是堆里面的那个对象的地址
    Car  car4=car3;// car3对象的地址 赋值给了car4
    Car  car5=new Car();
    car3.setCarName("大众");
    car5.setCarName("大众");
    System.out.println(car3.hashCode());//对象在内存的位置
    System.out.println(car4.hashCode());
    System.out.println(car5.hashCode());

    car3=null;//  String  str=null;  类是引用类型     null 表示当前对象的名字在内存没有任何指向

    //  java有一个机制 垃圾回收机制  对不用的数据进行垃圾回收


    int n=0;
    n=n++;









  }
}
