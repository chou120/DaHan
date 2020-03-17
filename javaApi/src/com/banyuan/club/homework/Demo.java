package com.banyuan.club.homework;

import java.io.UnsupportedEncodingException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/17 9:31 上午
 */
public class Demo {

  public static void main(String[] args) throws UnsupportedEncodingException {
    String str = "我ABCD此生不悔入华夏";//  '_ _ _'
    str=subStr(str,7);
    System.out.println(str);

  }

  //汉字不能截取一半

  public static String subStr(String str, int length) throws UnsupportedEncodingException { //截取指定长度的子串
    if (str == null) {
      return null;
    }
    if ("".equals(str)) {
      return "";
    }
    //如果  指定的长度超过字符串本身的长度   length默认长度就是字符串的长度
    byte[] by = str.getBytes();
    int  len=by.length;

    if (len < length) {
      length = len;
    }
    //
    String st;
    if (by[length] < 0) {
      st = new String(by, 0, --length);
    } else {
      st = new String(by, 0, length);
    }
    return st;
  }
}
