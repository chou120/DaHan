package com.banyuan.club.implThread3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 3:19 下午
 */
public class TestThread {

  public static void main(String[] args) {
    MyThread  myThread=new MyThread();

    Thread  t1=new Thread(myThread,"线程A");
    Thread  t2=new Thread(myThread,"线程B");
    Thread  t3=new Thread(myThread,"线程C");

    t1.start();

    try {
      Thread.sleep(200);
      //t1.stop();  //让线程停止 不在执行
      t1.interrupt();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    t2.start();
    t3.start();


    /**
     *  A B  A.yeild() 让出执行权  A重新处于就绪状态 需要重新和其他线程抢占执行权
     *  A B   A.sleep()  -->就绪状态  Sleep(时间过完了)准备重新执行
        A B   A.wait()   会释放一个锁的标志  A线程进入等待状态(其他的现在会抢占它释放的锁)
            等待被其他的线程唤醒 notify() 唤醒之后又重新进入就绪状态
     sychronized 锁  锁住资源  让其他的线程进入线程锁池  等待执行的信号

     如果线程出现了异常 或者是正常结束了  表示线程死亡

     什么情况下 线程会出现中断  表示线程结束了

     stop() 和 Interrupter()方法 表示中断
        前者表示彻底中短 该线程直接死亡  不会在执行
        后者 如果遇到wait()  sleep() join() 中断状态会直接清除    程序继续执行
     */





  }
}
