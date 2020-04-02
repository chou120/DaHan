package com.banyuan.lambda3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 3:37 下午
 */
public interface Function1 {
  /*
      jdk8内置的四大函数式接口

       Java8 内置的四大核心函数式接口

     Consumer<T> : 消费型接口
 * 		void accept(T t);
 * Consumer：定义了 void accept(T t) 抽象方法，需要访问某对象并对其进行某些操作时可以使用
 *
 * Supplier<T> : 供给型接口
 * 		T get();
 * Supplier：定义了 T get() 抽象方法，不接收参数返回Lambda表达式的值
 *
 * Function<T, R> : 函数型接口
 * 		R apply(T t);
 * Function：定义了 R apply(T t) 抽象方法，它接受一个 泛型T的对象，并返回一个泛型R的对象。如果需要将接收对象转换成其它对象可以使用
 *
 * Predicate<T> : 断言型接口
 * 		boolean test(T t);
 * Predicate：定义了 boolean test(T t) 抽象方法，需要表示一个涉及类型T的布尔表达式时可以使用
 *
 *
 *
 * BiFunction：定义 R apply(T t, U u) 抽象方法，接收t和u参数，返回R对象，如果需要两个对象中的某些值来组装成另一个对象，
 * 			可以使用。我把它看成Function的神级版


   */

}
