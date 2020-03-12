package com.banyuan.test;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 1:32 下午
 */
class  X{
  static{
    System.out.println("静态代码块Fu...");
  }
  {
    System.out.println("构造代码块Fu....");
  }
  public  X(){
    System.out.println("无参构造代码块Fu...");
  }
}
class Son  extends X{
  static{
    System.out.println("静态代码块Son...");
  }
  {
    System.out.println("构造代码块Son....");
  }
  public  Son(){
    System.out.println("无参构造代码块Son...");
  }

}
class  TestFu_Son{
  public static void main(String[] args) {
    Son  son=new  Son();
  }
}