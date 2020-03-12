package com.banyuan.oop8;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 10:00 上午
 */
public class Son  extends  ExtendsOver {

  //千万不要修改重写方法的任何一个地方  除了参数名称  否则就变成了重载
  //因为还有一个对父类的隐藏的同名继承方法
  //子类继承的方法的访问权限一定要大于等于父类的方法的访问权限   不然会报错
  public    void   add(int  b){

  }
}
