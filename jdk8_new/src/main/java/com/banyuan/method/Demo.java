package com.banyuan.method;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/3 9:13 上午
 */
public class Demo {
//  当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
//      （实现抽象方法的参数列表，必须与方法引用方法的参数列表保持一致！）
//  方法引用：使用操作符 “::” 将方法名和对象或类的名字分隔开来。
//  如下三种主要使用情况：
//
//  对象::实例方法
//
//  类::静态方法
//
//  类::实例方法


  public static void main(String[] args) {
    Consumer<Integer> con = new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {
        System.out.println("哈撒给..." + 123);
      }
    };
    con.accept(213);

    //lambda
    con = (i) -> System.out.println("哈撒给..." + i);
    con.accept(1232213);

    //方法引用

    con = (x) -> System.out.println(x);
    con.accept(12);
    System.out.println("------");

    con = System.out::println;
    con.accept(123);

    MethodInterface methodInterface = new ImplMethod();
    Consumer<String> show1 = methodInterface::show;
    show1.accept("saasdass");  //可以使用消费类型的接口

    //
    Supplier<String> s = ImplMethod::getValue;   //使用的如果是方法引用 返回的结果是函数式接口
    String string = s.get();
    System.out.println(string);

    Student student = new Student("张三", 32);
    //System.out.println(student.getName());
    Supplier supplier = student::getName;

    System.out.println(supplier.get());

    //boolean   flag=student.getAge() > 30;
    //
    Predicate<Student> p = (student1) -> student1.getAge() > 30; //断言型接口
    boolean flag = p.test(student);

    Supplier<Integer>  supplier2= student::getAge;
    System.out.println(supplier2.get()>30);


    Consumer c = System.out::println;//消费型接口
      c.accept(flag);

      //调用静态方法
    BiFunction<Double, Double, Double> fun = (x, y) -> Math.max(x, y);
    System.out.println(fun.apply(1.5, 22.2));
    System.out.println("--------------------------------------------------");

    BiFunction<Double, Double, Double> fun2 = Math::max;
    System.out.println(fun2.apply(1.2, 1.5));

    Function<Student,Boolean>  function=Demo::get;
    Boolean  f=function.apply(new  Student("王五",36));
    System.out.println(f);

    Supplier<String>  t=ImplMethod::getValue;
    System.out.println(t.get());

  }

  public static boolean get(Student student) {
    return student.getAge() > 30;
  }

}

class ImplMethod implements MethodInterface {

  public void show(String string) {
    System.out.println("哈哈是" + string);
  }

  public static String getValue() {
    return "大保健";
  }


}


