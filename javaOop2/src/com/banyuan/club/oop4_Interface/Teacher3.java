package com.banyuan.club.oop4_Interface;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 10:06 上午
 */
public class Teacher3   implements  CreateFunction{

  //研发功能
  @Override
  public   void  createNew(String   type){
    System.out.println(type+"老师有研发的功能...");
  }


}
