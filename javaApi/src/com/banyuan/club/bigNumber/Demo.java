package com.banyuan.club.bigNumber;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/17 2:24 下午
 */
public class Demo {

  public static void main(String[] args) {
    System.out.println(0.09+0.01); //0.09999999999999999 基本类型的小数在做相加操作的时候会 造成数据丢失
    //一般情况下 开发 很少使用double 或者是 float来定义小数
    //大数值

    BigDecimal   bigDecimal1=new BigDecimal("0.009");
    BigDecimal   bigDecimal2=new BigDecimal("0.2");

    BigDecimal  big= bigDecimal1.add(bigDecimal2);

    System.out.println(bigDecimal1.multiply(bigDecimal2));

    System.out.println(bigDecimal1.divide(bigDecimal2));

    System.out.println(bigDecimal1.subtract(bigDecimal2));

    System.out.println(bigDecimal1.divide(bigDecimal2,1 , RoundingMode.HALF_UP));



    BigInteger   bigInteger1=new BigInteger("7867564534");
    BigInteger   bigInteger2=new BigInteger("7867564534");


    System.out.println(bigInteger1.multiply(bigInteger2));



  }

}
