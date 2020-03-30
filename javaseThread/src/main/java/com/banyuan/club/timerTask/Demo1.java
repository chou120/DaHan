package com.banyuan.club.timerTask;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 10:41 上午
 */
public class Demo1 {


  /*
  Timer
  public Timer()
  public void schedule(TimerTask task, long delay)
  public void schedule(TimerTask task,long delay,long period)
  TimerTask
  public abstract void run()
  public boolean cancel()
   */
  public static void main(String[] args) {
    Timer  timer=new Timer();

    timer.schedule(new MyTimerTask(), 3000,1000);
    //三秒之后执行目标任务,并且每过一秒执行一次
  }
}

class  MyTimerTask  extends  TimerTask{
  @Override
  public void run() {
    //命令行  关机   开机的任务
    System.out.println("sudo shutdown -r now");
      //cancel();
  }
}



