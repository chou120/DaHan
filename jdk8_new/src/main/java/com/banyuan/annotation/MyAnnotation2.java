package com.banyuan.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 1:58 下午
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)  //表示注解在什么时候起作用
public @interface MyAnnotation2 {

    String   name() default "大保健";
    String   address() default "半圆";
}
