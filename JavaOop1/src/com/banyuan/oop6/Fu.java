package com.banyuan.oop6;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/11 3:06 下午
 */
public class Fu {

  private  String name="张大炮";
  public  String  address="炮王";

  private  int   age=1;

  public Fu(String name) {
    this.name = name;
    System.out.println("我是父类的有参构造器1");
  }

  public Fu(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("我是父类的有参构造器2...");

  }

  public Fu() {
    System.out.println("我是父类的无参构造....");

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public   void  test(){
    System.out.println(this.age+"父类的...."+this.name);
  }

}
