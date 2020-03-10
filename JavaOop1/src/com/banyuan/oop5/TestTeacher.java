package com.banyuan.oop5;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 2:33 下午
 */
public class TestTeacher {

  public static void main(String[] args) {
    Teacher  teacher=new Teacher();
    int  result=teacher.buyCar(200);
    System.out.println("第一个老师剩下:"+result);

//    int  result=teacher.buyFly(200);
//    System.out.println("还剩下:"+result);


    Teacher  teacher2=new Teacher();
    teacher2.buyCar(200);
    System.out.println("第二个老师剩下:"+result);

//    result=teacher.buyFly(200);
//    System.out.println("还剩下:"+result);

  }


}
