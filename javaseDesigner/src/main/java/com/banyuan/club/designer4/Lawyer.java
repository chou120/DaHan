package com.banyuan.club.designer4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 3:31 下午
 */
public class Lawyer<T> implements InvocationHandler {

  T  t; //目标类   代理目标对象

  public Lawyer(T t) {
    this.t = t;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    Object  obj= method.invoke(t,args);

    return obj;
  }

//  //律师 代理 目标类
//  Worker worker;
//
//  public Lawyer(Worker worker) {
//    this.worker = worker;
//  }
//
//  @Override
//  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
//    //如果在目标类执行之前多操作  叫前置通知   做文件日志操作...或者 增加额外功能的操作
//
//    //在执行目标方法之前 添加 贿赂 sendMoney() 功能
//
//    //object 是目标方法的返回值...
//    Object object = method.invoke(worker,args);
//
//    boolean flag=sendMoney();
//    if(flag){ //贿赂我就撤诉...
//      worker.cheSu();
//    }
//    //如果在目标类执行之前多操作  叫后置通知
//    return object;
//  }
//
//  public   boolean   sendMoney(){
//    System.out.println("在打官司之后进行贿赂...300万...");
//    return  true;
//  }



}
