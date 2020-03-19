//package com.banyuan.club;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
///**
// * @author sanye
// * @version 1.0
// * @date 2020/3/18 4:33 下午
// */
//public class A {
//  final static String[] PokerDeal = {"红桃A","红桃2","红桃3","红桃4","红桃5","红桃6","红桃7","红桃8","红桃9","红桃10","红桃J","红桃Q","红桃K",
//      "黑桃A","黑桃2","黑桃3","黑桃4","黑桃5","黑桃6","黑桃7","黑桃8","黑桃9","黑桃10","黑桃J","黑桃Q","黑桃K",
//      "方片A","方片2","方片3","方片4","方片5","方片6","方片7","方片8","方片9","方片10","方片J","方片Q","方片K",
//      "梅花A","梅花2","梅花3","梅花4","梅花5","梅花6","梅花7","梅花8","梅花9","梅花10","梅花J","梅花Q","梅花K",
//      "大王","小王"};
//
//  // 随机数
//  static final int randNum (){
//    Random random = new Random();
//    return random.nextInt(53);
//  }
//
//  // 发牌
//  static void deal(){
//    int[] dellNum = new int[54];
//    for (int i = 0; i < dellNum.length; i++){
//      dellNum[i] = randNum();
//      // 去掉重复的数
////      for (int j = 0; j < i; j++){
////        if(dellNum[i] == dellNum[j]){
////          --i;
////        }
////      }
//    }
//
////        // 判断哪个玩家是地主，最大的是地主
////        int[] player = new int[3];
////        for (int i = 0; i < player.length; i ++){
////            player[i] = randNum();
////        }
////        int max = 0;
////        if(player[max] < player[1]){
////            max = 1;
////        }else if(player[max] < player[2]){
////            max = 2;
////        }
//
//    System.out.println("玩家A的牌：");
//    for (int i = 0; i < 17; i++){
//      System.out.printf(PokerDeal[dellNum[i]]+" ");
//    }
//    System.out.println();
//    System.out.println("玩家B的牌：");
//    for (int i = 17; i < 35; i++){
//      System.out.printf(PokerDeal[dellNum[i]]+" ");
//    }
//    System.out.println();
//    System.out.printf("玩家C地主的牌：");
//    for (int i = 35; i <= 54; i++){
//      System.out.printf(PokerDeal[dellNum[i]]+" ");
//    }
//
//
//
//  }
//  public static void main(String[] args) {
//    String[] a = { "方块", "黑桃", "梅花", "红桃" };
//    String[] b = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
//    List box = new ArrayList();
//
//    for (int i = 0; i < a.length; i++)
//      for (int j = 0; j < b.length; j++)
//        box.add(a[i] + b[j]);
//    box.add("大王");
//    box.add("小王");
////    将box内数据打乱（没写成功） 重新定义一个box1，将打乱后的数存在里面，
//
//    List nongMin1 = new ArrayList();
//    List nongMin2= new ArrayList();
//    List diZhu = new ArrayList();
//
//    for (int i = 0; i < box1.size() - 3; i++) {
//      if(i%3==0)
//        nongMin1.add(box1.get(i));
//      else if(i%3==1)
//        nongMin2.add(box1.get(i));
//      else if(i%3==2)
//        diZhu.add(box1.get(i));
//    }
//
//    diZhu.add(box1.get(51));
//    diZhu.add(box1.get(52));
//    diZhu.add(box1.get(53));
//
//    System.out.println("农民1："+nongMin1);
//    System.out.println("农民2："+nongMin2);
//    System.out.println("地主："+diZhu);
//  }
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//  }
//
//  public   static    int   show(){
//    try{
//
//      System.out.println("try,......");
//
//      return 5;
//
//    }catch (Exception  e){
//      e.getStackTrace();
//    }finally {
//      System.out.println("你猜我会不会执行....");
//    }
//    return  0;
//  }
//
//
//}
//
//class  B extends A{
//
//
//}
//
