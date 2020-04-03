package com.banyuan.testStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/3 10:41 上午
 */
public class StreamAP1 {

  /*
      Java8中有两大最为重要的改变。
      第一个是 Lambda 表达式；另外一 个则是 Stream API(java.util.stream.*)。
      Stream 是 Java8 中处理集合的关键抽象概念，它可以指定你希望对
      集合进行的操作，可以执行非常复杂的查找、过滤和映射数据等操作。
      使用Stream API 对集合数据进行操作，就类似于使用 SQL 执行的数
      据库查询。也可以使用 Stream API 来并行执行操作。
      简而言之,Stream API 提供了一种高效且易于使用的处理数据的方式。
   */
  public static void main(String[] args) {

    /**
     * default Stream<E> stream() : 返回一个顺序流
     * default Stream<E> parallelStream() : 返回一个并行流
     *  	parallelStream提供了流的并行处理，它是Stream的另一重要特性，其底层使用Fork/Join框架实现。
     *  	简单理解就是多线程异步任务的一种实现。
     */
    List<String> list = new ArrayList<>();
    list.add("123");
    list.add("21312");
    list.add("1");
    list.add("12223");
    list.add("82423");

    Stream<String> stream = list.stream(); //获取一个顺序流   按照顺序
    // stream.forEach(System.out::println);

    System.out.println("下面是并行流:");
    Stream<String> parallelStream = list.parallelStream(); //获取一个并行流
    // parallelStream.forEach((str)-> System.out.println(Thread.currentThread().getName()+"--"+str));

    //parallelStream.forEach((str)-> System.out.println(Thread.currentThread().getName()+"--"+str));
    //Stream只能被消费一次  一旦遍历之后就失效了  就想迭代器  想要再次遍历 就必须再次生成Stream
    //Stream上的操作并不会立即执行 只有等到用户真正需要的时候才会执行

    //2. 通过 Arrays 中的 stream() 获取一个数组流
    Integer[] nums = new Integer[5];
    nums[0] = 101;
    nums[1] = 21;
    nums[2] = 11;
    nums[3] = 1221;
    nums[4] = 21312;

    Stream<Integer> stream1 = Arrays.stream(nums);
    //stream1.forEach(System.out::println);

    //3. 通过 Stream 类中静态方法 of()
    //可以使用静态方法 Stream.of(), 通过显示值 创建一个流。它可以接收任意数量的参数
    Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 1231, 213123, 123, 123, 1231212312, 12);
    // stream2.forEach(System.out::println);

    //4. 创建无限流
    //迭代
    Stream<Integer> stream3 = Stream.iterate(0, (x) -> x + 2).limit(10);
    // stream3.forEach(System.out::println);

    //生成
    Stream<Double> stream4 = Stream.generate(Math::random).limit(3);
    // stream4.forEach(System.out::println);

    //2. 中间操作   调用中间操作只会生成一个标记了该操作的新的Stream   仅此而已
    // 结束操作  会出阿发实际计算  计算发生的时候会把所有想中间积攒的操作一次统计 计算完之后Stream就失效了
    List<Employee> emps = Arrays.asList(
        new Employee(102, "李四", 59, 6666.66),
        new Employee(101, "张三", 18, 9999.99),
        new Employee(103, "王五", 28, 3333.33),
        new Employee(104, "赵六", 8, 7777.77),
        new Employee(104, "赵六", 8, 7777.77),
        new Employee(104, "赵六", 8, 7777.77),
        new Employee(105, "田七", 38, 5555.55)
    );

	/*
	  筛选与切片
		filter——接收 Lambda ， 从流中排除某些元素。
		limit——截断流，使其元素不超过给定数量。
		skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
		distinct——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
	*/

    //所有的中间操作不会做任何的处理
    Stream<Employee> stream5 = emps.stream()
        .filter((e) -> {
          System.out.println("测试中间操作");
          return e.getAge() <= 35;
        });

    //只有当做终止操作时，所有的中间操作会一次性的全部执行，称为“惰性求值”
    // stream5.forEach(System.out::println);
    stream5 = emps.stream().distinct();
    //  stream5.forEach(System.out::println);

    stream5 = emps.stream().filter((e) -> e.getMoney() >= 5000).skip(2);
    //stream5.forEach(System.out::println);


   Stream<String> stream6=emps.stream().map((em)-> em.getName()+em.getMoney()).limit(2);
  // stream6.forEach(System.out::println);
    Optional optional =emps.stream().findFirst();  //返回第一个  也是终止操作
   // System.out.println(optional.get());

   Optional<Employee>  m=emps.stream().max((o1,o2)->(int)(o1.getMoney()-o2.getMoney()));
   // System.out.println(m.get());

    Stream<Employee>  stream7=emps.stream().sorted((o1,o2)->(int)(o1.getMoney()-o2.getMoney()));
    //stream7.forEach(System.out::println);


    boolean  flag=emps.stream().anyMatch((e)->e.getMoney()>7000);
    flag=emps.stream().allMatch((e)->e.getMoney()>7000);

    flag=emps.stream().noneMatch((e)->e.getMoney()<7000);

    System.out.println(flag);  //判断流里面的的数据是否按照给的条件进行匹配

//    m= emps.parallelStream().findAny();  //使用并行流做查找任意一个操作
//    System.out.println(m.get());

    long    count=emps.stream().filter((e)-> e.getMoney()>5000).count();
    System.out.println(count);

    //Stream 千万不要和 IO流弄混了
    //前者是对集合操作的   后者是对文件操作的
    

  }

}
