package com.banyuan.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 1:44 下午
 */
//
@Target(ElementType.METHOD)    //用于描述注解的使用范围
public @interface MyAnnotation {

  /*
     默认的就是继承了  java.lang.annotation.Annotation
     一个注解可以放在类的任何一个地方
    元注解: 专门用来注解  自定义注解的
      @target
          用于描述注解的使用范围
      ElementType.xxx

      @Retention
        用于描述注解的生命周期

      @Inherited
          用于表示某个标注 是被继承的
          如果一个使用了  @Inherited修饰了 annotation 类型  被用于一个class文件
          则这个 annotation 将被用于该类的子类
  */


//  String  name();
//  String  address() default "南京";
//  int  age()  default 1;

  //String  value();
  String[] value();
  String  name();

}
