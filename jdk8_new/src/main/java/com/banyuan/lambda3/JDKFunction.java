package com.banyuan.lambda3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 3:39 下午
 */
public class JDKFunction {

  public static void main(String[] args) {

    //正常的方法实现
    MyFunction myFunction = new MyFunction() {
      @Override
      public void show(double money) {
        System.out.println("我花了" + money + "块钱");
      }
    };
    myFunction.show(3456);

    //变身   ----->>>>>   lambda
//    MyFunction  myFunction2 = (double money) -> System.out.println("我花了"+money+"块钱");
//    myFunction2.show(1231); //把目标的方法放到了一个静态方法里面去执行了  其实就是在静态方法里面执行了方法体
//

    //jdk8自动提供了一个函数式接口  消费型接口
    Consumer<Integer> in = new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {
        System.out.println("我花了" + integer + "块钱");
      }
    };
    in.accept(12341);

    //lambda写法
    Consumer<Integer> in1 = (x) -> System.out.println("我花了" + x + "块钱");
    in1.accept(12543);

    //供给型接口

    List<String> list = new ArrayList<>();
    list.add("仓木麻衣");
    list.add("张三丰");
    list.add("闫正池");
    list.add("谈冬冬");
    list.add("赵一帆");
    list.add("韩朝");

    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        String st = "";
        for (String str : list) {
          if (str.length() == 3) {
            st = st + str + "  ";
          }
        }
        return st;
      }
    };

    String s = supplier.get();
    System.out.println(s);

    //lambda表达式的写法
    Supplier<String> supplier2 = () -> {
      String st = "";
      for (String str : list) {
        if (str.length() == 3) {
          st = st + str + "  ";
        }
      }
      return st;
    };
    System.out.println("-----" + supplier2.get());

    //Function函数接口
    Function<String, Integer> function = new Function<String, Integer>() {
      @Override
      public Integer apply(String s) {
        return Integer.valueOf(s) + 2143;
      }
    };
    System.out.println(function.apply("56"));
    //lambda表达式
    Function<String, Integer> function2=(str)-> Integer.valueOf(str) + 43;
    System.out.println(function2.apply("54"));

    //断言型接口

    list.add("苍井空");
    list.add("James leburon");
    list.add("Iversion");

    Predicate<String>  predicate=new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.length()>3 && s.length()< 7;
      }
    };
    String  str="";
    for (String  st: list) {
      if(predicate.test(st)){
        str+=st;
      }
    }
    System.out.println(">>>>>>>>>"+str);
  }
  //  BiConsumer<T, U>   BiFunction<T, U, R>

}

//自定义函数式接口
@FunctionalInterface
interface MyFunction {
  void show(double money);
}




