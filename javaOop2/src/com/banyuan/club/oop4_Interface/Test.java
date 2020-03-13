package com.banyuan.club.oop4_Interface;

import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 10:07 上午
 */
public class Test {

  public static void main(String[] args) {
//    Person   p=new Teacher();
//    Teacher  t=(Teacher)p;
//    t.createNew("语文");
//
//
//    Teacher2  teacher2=new Teacher2();
//    teacher2.createNew("数学");
//
//
//    Teacher3  teacher3=new Teacher3();
//    teacher3.createNew("化学");


    //甲方爸爸  项目  --2000万-->>> 乙方
    // 一年 之内   项目进行交付    1000 + 1000
    //项目上线  是不是要维护    项目上线需要部署

    // 如果让你们做开发公司  如何让利益最大化     2000万 不仅是拿2000万
    // 给项目写了很多功能
    /**
     * 1.语文老师研发
     * 2.数学老师研发
     * 3.化学老师研发的功能
     *
     * 卖代码给别的公司   ----->>>>> 10  万
     *
     * 卖给了 C  不公开源码   --->>>   把项目打包 对外提供一个接口  C通过访问这个接口
     * 去调用相应的功能
     *
     *
     */
    CreateFunction  createFunction=new Teacher2();
    Tool.show(createFunction, "语文");

    //面向接口编程



  }

}
