package com.banyuan.finalDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/12 10:51 上午
 */
public class Demo {

  int num ;
  final int num2 =90;


}

class Sonny extends Demo {

  public void show() {
    num = 100;
    System.out.println(num);
    //num2 = 200;
    System.out.println(num2);
  }


  public static void main(String[] args) {
    Sonny sonny = new Sonny();
    sonny.show();
  }
}

