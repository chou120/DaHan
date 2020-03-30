package com.banyuan.club.homework2;

import java.util.concurrent.CountDownLatch;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 9:37 上午
 */
public class Tools {

  int   i=0;
  //为了解决高并发的问题   CountDownLatch  类似于一个线程计数器  使一个线程或者多个线程完成各自的工作然后再继续执行
  CountDownLatch countDownLatch=new CountDownLatch(2);// 2表示有两个线程计数器
  boolean flag=true;


}
