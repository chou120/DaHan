package com.banyuan.club.oop2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 3:05 下午
 */
public class GrandPa {
  public void  show(){
    show2();
  }
  public  void  show2(){
    System.out.println("我");
  }
}
class  Fu  extends  GrandPa{

  public  void  show2(){
    System.out.println("爱");

  }
}
class  Sonny  extends Fu {
  public   void show(){
    super.show();
  }
  public  void  show2(){
    System.out.println("你");
  }
}
class  Test{
  public static void main(String[] args) {
    GrandPa  grandPa=new Fu();
    grandPa.show();//请问输出结果

    Fu fu=new Sonny();
    fu.show();
  }
}

/*
  自己琢磨?
 */

