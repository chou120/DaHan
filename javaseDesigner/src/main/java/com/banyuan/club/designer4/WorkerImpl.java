package com.banyuan.club.designer4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 3:29 下午
 */
public class WorkerImpl  implements Worker {

  @Override
  public String data(String  name) {
    System.out.println("我有"+name+"欠条...");

    return "500万...";
  }
  @Override
  public void askForMoney() {
    System.out.println("无良老板,跟着小姨子跑路了...");
  }

  @Override
  public void cheSu() {
    System.out.println("我撤诉...");
  }
}
