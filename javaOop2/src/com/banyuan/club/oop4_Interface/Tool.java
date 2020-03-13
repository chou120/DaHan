package com.banyuan.club.oop4_Interface;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 10:19 上午
 */
public class Tool {

  private  Tool(){ //构造器私有化 意味着  Tool不能被创建对象

  }

  public   static   void  show(CreateFunction  createFunction,String  type){
        createFunction.createNew(type);
  }


}
