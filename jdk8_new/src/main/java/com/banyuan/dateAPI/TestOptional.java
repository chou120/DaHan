package com.banyuan.dateAPI;

import java.util.Optional;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/7 11:42 上午
 */
public class TestOptional {

  /**
   * Optional<T> 类(java.util.Optional) 是一个容器类，代表一个值存在或不存在，
   *
   * 原来用 null 表示一个值不存在，现在 Optional 可以更好的表达这个概念。并且
   * 可以避免空指针异常。 常用方法：
   * Optional.of(T t) : 创建一个 Optional 实例 Optional.empty() : 创建一个空的 Optional 实例
   * Optional.ofNullable(T t):若 t 不为 null,创建 Optional 实例,否则创建空实例
   * isPresent() : 判断是否包含值
   * orElse(T t) : 如果调用对象包含值，返回该值，否则返回t  orElseGet(Supplier s) :如果调用对象包含值，返回该值，否则返回 s 获取的值
   * map(Function f): 如果有值对其处理，并返回处理后的Optional，否则返回 Optional.empty()
   * flatMap(Function mapper):与 map 类似，要求返回值必须是Optional
   * @param args
   */


  public static void main(String[] args) {

//    Optional  optional=Optional.of(new Employee());
//    System.out.println(optional.get());

//    Optional<Employee> op = Optional.ofNullable(null);
//		System.out.println(op.get());

	//	Optional<Employee> op = Optional.empty();
    // System.out.println(op.get());

//    Optional<Employee> op = Optional.ofNullable(null);
//
//    if(op.isPresent()){
//      System.out.println("----"+op.get());
//    }
//
//    Employee emp = op.orElse(new Employee("张三"));
//    System.out.println(emp);
//
//    Employee emp2 = op.orElseGet(() -> new Employee());
//    System.out.println(emp2);

    Optional<Employee> op = Optional.of(new Employee(101, "张三", 18, 9999.99));

    Optional<String> op2 = op.map(Employee::getName);
    System.out.println("-----"+op2.get());

    Optional<String> op3 = op.flatMap((e) -> Optional.of(e.getName()));
    System.out.println(op3.get());

    


  }

}
