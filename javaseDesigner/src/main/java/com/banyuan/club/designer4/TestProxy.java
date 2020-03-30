package com.banyuan.club.designer4;

import java.lang.reflect.Proxy;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 3:33 下午
 */
public class TestProxy {


  public static void main(String[] args) {

    /**
     *
     * 在Java中java.lang.reflect包下提供了一个Proxy类和一个InvocationHandler接口，
     * 通过使用这个类和接口就可以生成动态代理对象。
     * JDK提供的代理只能针对接口做代理。我们有更强大的代理cglib
     * Proxy类中的方法创建动态代理类对象
     *
     * public static Object newProxyInstance(ClassLoader loader,
     *    Class<?>[] interfaces,InvocationHandler h)
     *
     * 最终会调用InvocationHandler的方法
     */
    Worker  worker=new WorkerImpl();
    Lawyer<Worker> lawyer=new Lawyer<>(worker);

    //返回目标类对象....
    Worker  obj=(Worker) Proxy.newProxyInstance(worker.getClass().getClassLoader(),
        new Class<?>[] { Worker.class }  ,lawyer);

    System.out.println(obj.data("王淼..."));
    //obj.askForMoney();


  }

}
