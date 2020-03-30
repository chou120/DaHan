package com.banyuan.club.timerTask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 10:56 上午
 */
public class MyThread  implements Callable {

  @Override
  public Object call() throws Exception {

    System.out.println("哈沙给...");

    return "你好啊,大保健...";
  }
}
class  Test{

  public static void main(String[] args) {
    MyThread  myThread=new MyThread();
    ExecutorService m=  Executors.newCachedThreadPool();
    Future f =m.submit(myThread);

    try {

      System.out.println(f.get());

    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }


  }

}