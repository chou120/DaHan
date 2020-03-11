package com.banyuan.oop7;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/11 4:10 下午
 */
public class Demo {

  /*
    多层继承
        ---- 1
            ----2
              ---- 3
   */

  public static void main(String[] args) {

//      Son  son=new  Son();
//      son.show();

    Father  father=new Father("小人物...");
    father.show();

    Father1  father1=new Father1("英雄人物");
    father1.show();


  }

}
