package com.banyuan.club.implThread7;

import java.util.concurrent.Semaphore;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 11:22 上午
 */
public class DieLock {

  static final Object  dao=new Object();
  static final Object  cha=new Object();

  //Semaphore 是 synchronized 的加强版，作用是控制线程的并发数量
  public static final Semaphore a1 = new Semaphore(1);
  public static final Semaphore a2 = new Semaphore(1);

  // Semaphore详解: https://www.cnblogs.com/klbc/p/9500947.html

}
