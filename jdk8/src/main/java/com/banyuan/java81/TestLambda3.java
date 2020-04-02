package com.banyuan.java81;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

/*
 * Java8 内置的四大核心函数式接口
 * 
 * Consumer<T> : 消费型接口
 * 		void accept(T t);
 * Consumer：定义了 void accept(T t) 抽象方法，需要访问某对象并对其进行某些操作时可以使用
 * 
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
	public static <T, U, R> R biFunction(T t,U u,BiFunction<T, U, R> biFunction){
        return biFunction.apply(t, u);
    }
	// 输出结果：ab
	System.out.println(biFunction("a", "b", (String t,String s)-> t+s));
	
	
	BiConsumer：定义了 void accept(T t, U u) 抽象方法，我把它看成Consumer的神级版
	public static <T, U> void biConsumer(T t, U u, BiConsumer<T, U> biConsumer) {
        biConsumer.accept(t, u);
    }
    // 输出结果：20.0
	Orange orange1 = new Orange();
	orange1.setWeight(10);
    Orange orange2 = new Orange();
    orange2.setWeight(10);
    biConsumer(orange1, orange2, (Orange orange11, Orange orange22) -> orange11.setWeight(orange11.getWeight()+orange22.getWeight()));
    System.out.println(orange1.getWeight());
 	
 * 
 * 
 */
public class TestLambda3 {
	
	@Test
	public void  test5(){
		  // 输出结果：20.0
		Orange orange1 = new Orange();
		orange1.setWeight(10);
	    Orange orange2 = new Orange();
	    orange2.setWeight(10);
	    biConsumer(orange1, orange2, (Orange orange11, Orange orange22) -> orange11.setWeight(orange11.getWeight()+orange22.getWeight()));
	    System.out.println(orange1.getWeight());
	}
	
	public static <T, U> void biConsumer(T t, U u, BiConsumer<T, U> biConsumer) {
        biConsumer.accept(t, u);
    }
  
	
	
	//Predicate<T> 断言型接口：
	@Test
	public void test4(){
		List<String> list = Arrays.asList("Hello", "banyuan", "Lambda", "www", "ok");
		List<String> strList = filterStr(list, (s) -> s.length() > 3);
		for (String str : strList) {
			System.out.println(str);
		}
	}
	//需求：将满足条件的字符串，放入集合中
	public List<String> filterStr(List<String> list, Predicate<String> pre){
		List<String> strList = new ArrayList<>();
		
		for (String str : list) {
			if(pre.test(str)){
				strList.add(str);
			}
		}
		return strList;
	}
	
	//Function<T, R> 函数型接口：
	@Test
	public void test3(){
		String newStr = strHandler("\t\t\t 半圆表演   ", (str) -> str.trim());
		System.out.println(newStr);
		
		String subStr = strHandler("半圆表演", (str) -> str.substring(2, 5));
		System.out.println(subStr);
	}
	
	//需求：用于处理字符串
	public String strHandler(String str, Function<String, String> fun){
		return fun.apply(str);
	}
	
	//Supplier<T> 供给型接口 :
	@Test
	public void test2(){
		List<Integer> numList = getNumList(10, () -> (int)(Math.random() * 100));	
		for (Integer num : numList) {
			System.out.println(num);
		}
	}
	//需求：产生指定个数的整数，并放入集合中
	public List<Integer> getNumList(int num, Supplier<Integer> sup){
		List<Integer> list = new ArrayList<>();	
		for (int i = 0; i < num; i++) {
			Integer n = sup.get();
			list.add(n);
		}
		return list;
	}
	
	//Consumer<T> 消费型接口 :
	@Test
	public void test1(){
		happy(10000, (m) -> System.out.println("花了" + m + "美金"));
	} 
	
	public void happy(double money, Consumer<Double> con){
		con.accept(money);
		
	}
}
