package com.banyuan.club.strAPI;

import com.banyuan.club.Person;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 3:50 下午
 */
public class StringAPI2 {


  public static void main(String[] args) {

    String str="你好";
    String   str1="你好";
    System.out.println(str.equals(str1)+"----"+(str==str1));


    str1=new  String("你好");
    System.out.println(str.equals(str1)+"----"+(str==str1));

    str="hello";
    str1="java";

    String  str3=str+str1;  // new BufferString(str).append(str1)
    System.out.println(str3.equals(str+str1)+"----"+(str3==(str+str1)));


    str="he";
    str1="llo";
    str3="hello";

    System.out.println(str3.equals(str+str1)+"----"+(str3==(str+str1)));

    //请问String  str=new String("你好"); 这步操作 创建了几个对象

    //一个是字符串常量对象   你好  + 还有一个是 new String()

    // equals 比较的是内容是否相等    ==  比较的是  地址和内容是否一样

    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    StringBuffer   stringBuffer=new StringBuffer();//在内存中创建了一个缓存区
    System.out.println(stringBuffer.capacity());//理论的长度值
    System.out.println(stringBuffer.length());//实际长度指的是有效的内容的长度

    stringBuffer =new StringBuffer(60);

    stringBuffer=new StringBuffer("张三");
    stringBuffer.append("张三丰"); //追加  就是往缓存区中追加

    stringBuffer.append(new Person("534212","王五","天上"));

    stringBuffer.append(true);
    stringBuffer.deleteCharAt(20);
    String   st=stringBuffer.substring(3,stringBuffer.length()-1);


    stringBuffer=new StringBuffer("564534231231");

    stringBuffer.reverse(); //反转


    System.out.println(",反转之后的数据:"+stringBuffer+"\n---截取得到的数据:"+st);

    //被加入字符串缓冲区的  不管什么类型的数据都会被同化成字符串



    //被String 修饰的字符串内容不可以改变   而被StringBuffer修饰的字符串内容是可以改变的 为什么

    String  string="大保健";
    String  string2="你真好";
    StringBuffer  sb=new StringBuffer("凯爹");
    StringBuffer  sb2=new StringBuffer("程咬金");
    //string=string+"你好"; //new   StringBuilder(String.valueOf(str).append("你好"))

    //
    //sb.append("我不好");
    changeStr(string, string2);

    System.out.println(string+">>>>>"+string2); //结果根本没变
    changeSb(sb,sb2);
    System.out.println(sb.toString()+"-----"+sb2.toString());

  }

  public   static  void   changeStr(String str1,String  str2){
    str1=str2;
    str2=str1+str2;
  }


  public   static  void   changeSb(StringBuffer str1,StringBuffer  str2){
    str1=str2;
    str2.append(str1);
  }

  /*
    String  StringBuffer  StringBuilder   总结


   */




}
