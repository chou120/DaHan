package com.banyuan;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/19 9:55 上午
 */
public class Joker {

  public static void main(String[] args) {

    //  54张牌        51     17+3    17    17
    String[] jokerColor = {"♥", "♦", "♣", "♠"};
    String[] jokerNum = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    //还有大小王
    //整理牌
    String str = "";
    List array = new ArrayList<>();  //一副牌
    for (int i = 0; i < jokerColor.length; i++) {
      for (int j = 0; j < jokerNum.length; j++) {
        str = jokerColor[i] + jokerNum[j];
        array.add(str);
      }
    }
    //存放大小王
    array.add("大王");
    array.add("小王");

    System.out.println(array.size());

    //洗牌   打乱牌序
    List arrayNew = new ArrayList();
    for (int i = 0; i < array.size(); i++) {
      //随机数   但是 随机数可能会重复
      int index = (int) (Math.random() * 54);
      //判断 数组里面是否包含这张牌
      if (!arrayNew.contains(array.get(index))) {
        arrayNew.add(array.get(index));
      } else {
        i--;
      }
    }

    //接下来  发牌   三个人
    List listN = new ArrayList();
    List listN1 = new ArrayList();
    List listN2 = new ArrayList();

    //如果想要确定地主 那么就要随机出一张牌
    List  arr=new ArrayList();
    for (int i = 0; i <3; i++) {
      int index = (int) (Math.random() * 54);
      arr.add(arrayNew.get(i));
    }
    //
   // System.out.println("----"+arrayNew.containsAll(arr));
    arrayNew.removeAll(arr);

    //从剩下的牌里面找到一个 地主标志牌
    int index = (int) (Math.random() * arrayNew.size());
    String flag_D=(String)arrayNew.get(index);


    for (int i = 0; i <arrayNew.size(); i++) {
      if(i%3==0){
        listN.add(arrayNew.get(i));
      }else if(i%3==1){
        listN1.add(arrayNew.get(i));
      }else if(i%3==2){
        listN2.add(arrayNew.get(i));
      }
    }
    //  随机出三张牌  另外存储 三张牌  谁满足地主条件就把牌给他

    if(listN.contains(flag_D)){
      listN.addAll(arr);

    }else if(listN1.contains(flag_D)){
      listN1.addAll(arr);

    }else {
      listN2.addAll(arr);

    }


    System.out.println("第一个人的牌有"+listN.size()+"张,如下:"+listN);
    System.out.println("第二个人的牌:"+listN1.size()+"张,如下:"+listN1);
    System.out.println("第三个人的牌:"+listN2.size()+"张,如下:"+listN2);



  }

}
