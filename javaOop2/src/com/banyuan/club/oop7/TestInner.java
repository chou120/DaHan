package com.banyuan.club.oop7;

import com.banyuan.club.oop7.StaticOuterInner.Inner;
import java.util.Stack;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 1:44 下午
 */
public class TestInner {

  public static void main(String[] args) {

    //1.在测试类中访问内部类的成员方法 如下
    // 外部类名.内部类名   变量名=new 外部类名().new 内部类名();
//    InnerClass.Inner   inner=new InnerClass().new  Inner();
//    inner.show();

    //2.对于静态内部类的成员访问
    // StaticOuterInner.Inner  sinner=new StaticOuterInner.Inner();
    // sinner.showTest();
    // StaticOuterInner.Inner.run();  //静态内部类的静态方法访问方式...

    /*
      3.首先对匿名对象的使用   就是没有名字的对象
     */

    Person p = new Person();
    System.out.println();

    //从30开始就没有对p使用了  得等到整个程序执行完毕之后p才会被垃圾回收 这样 p在整个程序执行完成之前一直占内存
    //如果对某个对象里面的成员只使用一次  那么我们可以使用匿名对象
    //new Person().成员;  一次使用完了之后  该匿名对象 自动被垃圾回收






  }
}
