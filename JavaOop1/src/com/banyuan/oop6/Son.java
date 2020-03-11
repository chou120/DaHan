package com.banyuan.oop6;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/11 3:06 下午
 */
public class Son  extends Fu {
  private  String  name="炮哥";
  public   String  address="炮楼";

  public Son() {
    super();  //调用 是父类的构造器
    System.out.println("我是子类的无参构造器....");
  }

  public Son(String name) { //在创建子类对象之前首先创建的是 父类对象
    super(name);
    this.name = name;
    System.out.println("我是子类的有参构造器....");
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public  void  showInfo(){
    System.out.println(super.address+"-----"+this.address+">>>>>>"+address);

    System.out.println(super.getName()+"-----"+this.getName()+">>>>>>"+getName());

  }

  //有个隐藏的 test()方法
  //子类发现父类的功能满足不了我的需求  为了维护代码的可用型  只能重写

  //又隐藏的 继承了  test()  在子类里面 有用吗  没用的

//  public   void   test(){
//
//  }

}
