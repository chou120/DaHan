package com.banyuan.oop2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/9 下午1:32
 */
public class Car {

  //  私有化属性和公有化方法的集合 叫封装  java  面向对象的第一个特征  也是一个标准的封装类(少了this)
  
  //创建一个汽车   汽车：品牌  名字  长度  高度  类型  产地 ....
  // 汽车行为特征: 驾驶     制冷    放歌  等等...

  private String  carBrand="长城";//汽车品牌
  private String  carName="五菱";
  private double  carLength; //private  私有的  只能在本类中被访问  其他的类不能直接访问
  private double  carHeight;
  private String  carType;
  private String  carAddress;

  //做个判断:判断车长是否满足条件
  public  void  setCarLength(double  length){
    if(length>=2.0 && length<=4.5){
      carLength=length;  //做个判断
    }else{
      carLength=1.0;
    }
  }
  public  void  setCarHeight(double  Height){
    if(Height>=1.0 && Height<=1.9){
      carHeight=Height;  //做个判断
    }else{
      carHeight=1.0;
    }
  }

  //
  public   void  setCarName(String  name){
    carName=name;
  }

  public   void   setCarBrand(String  brand){
    carBrand=brand;
  }

  public  void  setCarAddress(String  address){
    carAddress=address;
  }
  public  void  setCarType(String  type){
    carType=type;
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


  //咱们能不能把公共的输出的代码提取出来
  public  String    toString(){
    return "车子名称:"+carName+",型号:"+carType+",品牌:"+carBrand+",产地："
        + carAddress+",车长:"+carLength+",车高:"+carHeight;
  }

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
