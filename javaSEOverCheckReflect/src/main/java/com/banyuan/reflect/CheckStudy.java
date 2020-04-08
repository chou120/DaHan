package com.banyuan.reflect;

import java.lang.reflect.Field;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/8 10:19 上午
 */
public class CheckStudy {

  /*
     什么是反射？java反射机制在运行状态中  对于任意一个类都能知道这个类的属性和方法
     对于任意一个对象,都能调用它的任意的一个方法和属性,这种动态的获取信息以及
     动态的调用对象的信息(成员) 这个功能叫java反射机制

     如果想要解剖一个类就必须获取类的字节码文件对象

      类的加载器会将class文件加载到内存中 这个时候会被jvm虚拟机自动创建一个叫
      Class对象 (一个类只会产生一个该字节码对象)

      Class对象里面有Student类的一些信息

      反射的一个本质:就是得到class对象之后反向的获取Student对象的信息

   */

  public static void main(String[] args)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
    String  className="com.banyuan.reflect.Student";
    Class  clazz=Class.forName(className);
    //访问私有成员   暴力访问
    Object  obj=clazz.newInstance();
    Field f = clazz.getDeclaredField("stuName");
    f.setAccessible(true);
    System.out.println(f.get(obj));



  }
}
