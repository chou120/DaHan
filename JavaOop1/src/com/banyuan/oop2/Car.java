package com.banyuan.oop2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/9 下午1:32
 */
public class Car {

  //私有化属性和公有化方法的集合 叫封装  java  面向对象的第一个特征  也是一个标准的封装类

  //创建一个汽车   汽车：品牌  名字  长度  高度  类型  产地 ....
  // 汽车行为特征: 驾驶     制冷    放歌  等等...

  private String  carBrand="长城";//汽车品牌
  private String  carName="五菱";
  private double  carLength; //private  私有的  只能在本类中被访问  其他的类不能直接访问
  private double  carHeight;
  private String  carType;
  private String  carAddress;

  //做个判断:判断车长是否满足条件
  public  void  setCarLength(double  carLength){
    if(carLength>=2.0 && carLength<=4.5){
      this.carLength=carLength;  //做个判断
    }else{
      this.carLength=1.0;
    }
  }
  public  void  setCarHeight(double  carHeight){
    if(carHeight>=1.0 && carHeight<=1.9){
      this.carHeight=carHeight;  //做个判断
    }else{
      this.carHeight=1.0;
    }
  }

  //
  public   void  setCarName(String  carName){
    // 局部变量和全局变量 是不是以为 局部变量优先使用
    this.carName=carName;  // 把值 赋值给本身   this表示当前对象
  }

  public   void   setCarBrand(String  carBrand){
    this.carBrand=carBrand;
  }

  public  void  setCarAddress(String  carAddress){
    this.carAddress=carAddress;
  }
  public  void  setCarType(String  carType){
    this.carType=carType;
  }

//提供对外的访问方式
  public String getCarName() {
    return carName;
  }

  public String getCarAddress() {
    return carAddress;
  }

  public double getCarHeight() {
    return carHeight;
  }

  public double getCarLength() {
    return carLength;
  }

  public String getCarBrand() {
    carBrand="哈撒给:"+carBrand; //额外的代码操作
    return carBrand;
  }

  public String getCarType() {
    return carType;
  }

  @Override
  public String toString() {
    return "Car{" +
        "carBrand='" + carBrand + '\'' +
        ", carName='" + carName + '\'' +
        ", carLength=" + carLength +
        ", carHeight=" + carHeight +
        ", carType='" + carType + '\'' +
        ", carAddress='" + carAddress + '\'' +
        '}';
  }



  //咱们能不能把公共的输出的代码提取出来
//  public  String    toString(){
//    return "车子名称:"+this.carName+",型号:"+this.carType+",品牌:"+this.carBrand+",产地："
//        + this.carAddress+",车长:"+this.carLength+",车高:"+this.carHeight;
//  }
  // 就是说 在类的方法里面 一般情况下 最好不要有输出语句   输出语句一般只在测试类里面存在
//  public  void driver(){
//
//  }
//
//  public void  cold(){
//
//  }
//
//  public void  singSong(){
//
//  }


}
