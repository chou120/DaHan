package com.banyuan.club.list;

import java.util.Stack;
import sun.tools.jstat.Jstat;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/19 1:47 下午
 */
public class StackDemo {

  public static void main(String[] args) {

    Stack    stack=new Stack();  //栈   先进后出
    stack.add("你哈");
    stack.add("哈撒给");
    stack.add("肥宅快乐水...");
    stack.add("健康养生浴...");
    stack.add("椒盐锅巴团...");
    stack.add("增肥没商量...");

    System.out.println(stack);

    //System.out.println(stack.pop());

    int index=stack.search("增肥没商量...");  //在栈中的 第一个位置
    System.out.println(index);

    stack.push(34);
    System.out.println(stack);   //push   pop    search 都有栈的特性

    System.out.println(stack.remove(0)); //跟普通的集合一样  从头到尾开始移除
    System.out.println(stack);








  }


}
