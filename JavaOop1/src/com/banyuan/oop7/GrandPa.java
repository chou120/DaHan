package com.banyuan.oop7;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/11 4:18 下午
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
    super.show2();
  }
}
class  Sonny  extends  Fu{
  public   void show(){
    super.show2();
  }
  public  void  show2(){
    System.out.println("你");
  }
}
class  Test{
  public static void main(String[] args) {
    Sonny  sonny=new Sonny();
    sonny.show();//请问输出结果
  }
}
//今天晚上预习的内容  final关键字   多态
