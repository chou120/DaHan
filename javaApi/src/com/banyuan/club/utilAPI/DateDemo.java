package com.banyuan.club.utilAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/17 11:03 上午
 */
public class DateDemo {


  public static void main(String[] args) throws ParseException {

    Date   date =new  Date();
    System.out.println(date);//Tue Mar 17 11:05:25 CST 2020


   // date=new Date(1000); //计算机元年  1970.01.01  8:00:00
    //System.out.println(date); //Thu Jan 01 08:00:01 CST 1970

    System.out.println(date.getYear());  //  1900+120 =2020
    System.out.println(date.getTime()/1000/3600/24/30/12);  //  表示距离计算机元年早上8点过去多少毫秒 1584414679181

    date.setTime(1000);
    System.out.println(date);


    SimpleDateFormat  simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");//可以对时间进行解析 或者是包装

    String   strDate=simpleDateFormat.format(new  Date());


    System.out.println(strDate);



    String str="1998年0101112235";

    simpleDateFormat=new SimpleDateFormat("yyyy年MMddHHmmss");
    date=simpleDateFormat.parse(str);

    System.out.println(date);


    //随堂作业:通过手动输入请计算  现在距离你出生的时间过去了多少年  多少月  多少天  多少个小时

    Calendar  calendar=Calendar.getInstance();//获取本地时间的一个Calendar对象

    System.out.println("Calendar:"+calendar.getTime()+"---"+new Date());

    //calendar.set(2020, 4, 4);

   // System.out.println(calendar.getTime());


    System.out.println(calendar.get(Calendar.MONTH)+1);//  0  1

    System.out.println(calendar.get(Calendar.YEAR));

    System.out.println(calendar.get(Calendar.DATE));

    System.out.println(calendar.get(Calendar.SECOND));
    

    //五年前    add表示添加过去的时间
    calendar.add(Calendar.YEAR, 5);
    calendar.add(Calendar.MONTH, -1);

    System.out.println(calendar.getTime());

    calendar.clear();  //清除当前时间   回复到计算机元年
    System.out.println(calendar.getTime());


  }
}
