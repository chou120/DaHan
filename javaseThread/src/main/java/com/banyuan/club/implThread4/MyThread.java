package com.banyuan.club.implThread4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 3:54 下午
 */
public class MyThread  extends   Thread{

  private static int  number=50;  //保证资源统一

  public MyThread(String name) {
    super(name);
  }
  //
  @Override
  public void run() {
      //看电影 买票
    while(true){
//当某个线程执行到这一步  然后获取锁对象(MyThread.class) 其他线程只能在外面进行等待  等待先获取
      //对象锁的线程 执行完毕把锁释放    释放锁之后 该线程也加入 争夺行列
      synchronized (MyThread.class) {  //this表示当前对象  四个线程对象不能保证锁的唯一性
        if (number > 0) {
          System.out.println(Thread.currentThread().getName() + "卖第" + (number--) + "票");
        } else {
          break;
        }
      }

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }


  }

}
