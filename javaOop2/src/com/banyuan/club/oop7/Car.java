package com.banyuan.club.oop7;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 2:16 下午
 */
public class Car {

  public   String  show(){//该方法执行完毕之后 是不是就已经结束了  如果是一个正常的局部变量是不是也就消失了
    //但是在方法内部出现了内部类  内部类因为是class 级别 在创建对象之后  该对象是在堆里面  堆里面的对象会在整个程序结束之后才会消失
    // 如果该对象在堆里面还对局部变量继续引用  那么按照正常的情况下 局部变量已经消失了  那么就没法对局部变量引用
    //这个时候只能把局部变量 变成常量 引入到常量池里面 方便下次调用
  final   String  carName="张三";  //被final默认修饰了
    class Dog{
      String   dogName="田园土狗....";
      public String    method(){
        System.out.println(dogName+"在搞事情..."+carName);
        //carName="闫正池"; //只有一种情况下不能变量的值不能被修改
        return  "哈士奇";
      }
    }
    Dog  dog=new Dog();
    return  dog.method();
  }

}
class  TestCar{

  public static void main(String[] args) {
    System.out.println(new  Car().show());

  }
}