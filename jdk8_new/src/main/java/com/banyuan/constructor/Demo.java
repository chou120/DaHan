package com.banyuan.constructor;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/3 9:56 上午
 */
public class Demo {

  public static void main(String[] args) {

    /*
    格式：	ClassName::new
        与函数式接口相结合，自动与函数式接口中方法兼容。
        可以把构造器引用赋值给定义的方法，与构造器参数 列表要与接口中抽象方法的参数列表一致！
     */
    Supplier<Employee>  sup = () -> new Employee();
    System.out.println(sup.get().toString());

    System.out.println("------------------------------------");

    Supplier<Employee> sup2 = Employee::new;
    System.out.println(sup2.get().toString());


    BiFunction<String,String,Employee> sup1=(st,st1)->new Employee(st,st1);
    Employee  s=sup1.apply("张三", "下水道...");
    System.out.println(s.toString());


    //数组引用
    Function<Integer,Integer[]>  supplier1=(n)-> new  Integer[n];
    Integer[] integers=supplier1.apply(4);

    integers[0]=12;
    integers[1]=22;
    integers[2]=32;
    integers[3]=42;

    System.out.println(Arrays.toString(integers));



  }

}
@FunctionalInterface
interface   MyInterface<T>{
    T  get();
}


class  Mt<T> implements  MyInterface<T>{
  @Override
  public T get() {  //这里面的 代码随便我们怎么写


    return null;
  }
}

