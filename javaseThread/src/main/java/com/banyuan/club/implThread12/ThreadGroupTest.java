package com.banyuan.club.implThread12;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/27 4:39 下午
 */

//统一异常处理
public class ThreadGroupTest {

  public static void main(String[] args) {
    ThreadGroup threadGroup1 =
        // 这是匿名类写法
        new ThreadGroup("group1") {
          // 继承ThreadGroup并重新定义以下方法
          // 在线程成员抛出unchecked exception
          // 会执行此方法
          public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
          }
        };
    // 这是匿名类写法
    Thread thread1 =
        // 这个线程是threadGroup1的一员
        new Thread(threadGroup1, new Runnable() {
          public void run() {
            // 抛出unchecked异常
            throw new RuntimeException("测试异常");
          }
        });
    Thread thread2 =
        // 这个线程是threadGroup1的一员
        new Thread(threadGroup1, new Runnable() {
          public void run() {
            // 抛出unchecked异常
            throw new RuntimeException("测试异常");
          }
        });

    thread1.start();
    thread2.start();

    //如果不想使用线程组  可以统一销毁  这样更方便


  }


}
