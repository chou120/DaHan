package com.banyuan.finalDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 10:21 上午
 */
public  class FinalDemo {

  // 字面值常量

  // 自定义常量    final
  /*
    final 可以修饰类 修饰方法  修饰变量
    特点:被final修饰的变量的值 不可以被修改
        ...........类    不能被继承
        ...........方法   不能重写
    被final修饰的自定义常量一定要有初始化值  否则报错

    final出现的位置: 方法的形参前面
    public  void  show(final  int  age)


   */
  private  final String  COUNTRY="中国";  //  变量变成常量

  public   final static  String  COUNTRY_CITY="苏州市";


  public String getCountry() {
    return COUNTRY;
  }

  public  void  show(final  int  AGE){//一旦有了第一次传递过来的数据  那么就不能进行修改了
    //AGE=123;
    final  String  address="沾上干";
    //请问  address 在内存中什么时候消失  是show方法结束的时候消失 还是整个程序结束的时候消失
    System.out.println("地址为:"+address);

  }

  public  void  show(final  Person  person){//一旦有了第一次传递过来的数据  那么就不能进行修改了
    //请问  被final修饰的person对象是否可以修改
    person.setName("韩朝"); //为什么整个操作可以
    //person  接收端 是对象的地址  而person.setName()只是对对象的方法进行操作
    // person 接受的地址根本没有发生改变
   // person =new Person(); //这个操作是改变了person接受的地址 不在指向的是之前的对象 所以报错


  }

  /**
   *
   * class  Demo{
   *   int  num=10;
   *   final  int  num2=20;
   * }
   * class  Son extends Demo{
   *
   *   public void  show(){
   *     num=100;
   *     System.out.println(num);
   *     num2=200;
   *     System.out.println(num2);
   *   }
   *
   *  main(){
   *    Son  son=new  Son();
   *    son.show(); //请问执行结果
   *  }
   *
   *
   * }
   *
   *
   *
   *
   *
   *
   *
   */













  public static void main(String[] args) {
    String   st="大保健";
    st="你好";
    System.out.println("哈哈哈是");  //常量是不可变的


  }

}
