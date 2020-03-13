package com.banyuan.club.oop3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 9:15 上午
 */
public   class A {

  public static void main(String[] args) {

      ClassB b=new ClassB();
      b.g(new ClassA());

  }

}
interface InterfaceA{
  String s="good ";
  void f();

        void  hahah();




}
class ClassA implements InterfaceA{
  public void f(){
    System.out.print(s);
  }

  @Override
  public void hahah() {

  }
}
class ClassB{
  void g(InterfaceA a){
    a.f();
  }
}