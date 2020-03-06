package com.banyuan.club;


import java.io.Serializable;

/**
 * 文档注释
 *
 * @author sanye
 * @date 2020年3月6日 上午11：09：00
 * @since 1.0
 * @deprecated Operator 运算符知识点
 */

public class Operator {

  public static void main(String[] args) {

//    &   两个都是1才返回1   位运算
//    System.out.println(6&-7);  // 6
//
//    -7     1 0000 0111
//           1 1111 1000   反码+1=补码
//           1 1111 1001;

//    0000  0110
//    1111  1001
//   -----------------
//    0000  0000

//    |     只要有一个1就返回1

//    ~     对位运算符取反     0000 0110    1111 1001  补码-1反码  1111 1000   1 0000 0111 源码
    System.out.println(~6); //-7

//    ^  相同为0   不同为1
    System.out.println(5 ^ 7);   // 2
//    0000 0101
//    0000 0111
//   ------------
//    0000 0010

    //逻辑运算符   &&         &（逻辑判断）
    // 表达式1  &&  表达式2   只有两个表达式都成立 才为真   true   &也是一样
    //  && 如果第一个表达式不为真  那么 后面的表达式不会在继续判断    & 前面的表达式为假   后面的还会继续判断
    int a = 1, b = 2;

    System.out.println(++a > b & ++a < b);

    System.out.println(a);

    //  ||  短路或   表达式只要有一个成立整个式子就成立    true||false
    //  |   true  |  判断

    System.out.println(++b < 4 || ++b > 7);
    System.out.println(b); //b=3

    System.out.println(!(++b > 5));

    //  if(b=5){  //是 条件  而不是 数值
    //
    //  }

    //  表达式  ? 结果1 ：结果2；   if( ){  }else{  }

    String str = ++a + a++ + 6 > 9 ? "小子,你有点嚣张..." : "还有谁?";

    System.out.println(str);

    int  x=2;
    int  y=x++ +4 + ++x+1>6? x++ +4 + ++x+1>6?89:99:100;
    //求 x 的值

    //Serializable  m=1>2?3:"你好";  // 注意了:  到IO 去讲解 序列化
    //System.out.println("-----"+m);
    /*
      switch (4.5-3.6){  // 整数型   字符串    字符串    枚举JDK1.5版本以后才支持的

        case  0.9:
      }
    */

    //  a   b  两个数     请 使用 三种方式 将a   b的值 相互交换

    int  n=12,m=14;
    //第一种方式  中间值
//    int temp=n;
//    n=m;
//    m=temp;

    //System.out.println("n="+n+",m="+m);

    //第二种:加减法
    n=n+m;
    m=n-m;
    n=n-m;

    System.out.println("n="+n+",m="+m);

    //第三种:异或  相同为假 不同为真
    a=a^b;
    b=a^b;
    a=a^b;
    
            //   0000 1100
             //   0000 1110
     /* ----------------------
      a=     0000 0010
             0000 1110
      ----------------
      b=      0000 1100

              0000 0010
      ----------------
      a=      0000 1110

     */





  }
}
