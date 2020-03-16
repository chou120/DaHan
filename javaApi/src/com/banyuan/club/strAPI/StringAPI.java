package com.banyuan.club.strAPI;

import java.io.UnsupportedEncodingException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 2:07 下午
 */
public class StringAPI {

  public static void main(String[] args) throws UnsupportedEncodingException {
    String str = new String();
    //System.out.println(str.length());

    byte[] bytes = {97, 98, 99, 100, 101};
    str = new String(bytes);

    //System.out.println(str);

    str = new String(bytes, "GBK");
    //System.out.println(str);

    str = "张三李四王二麻子";
    byte[] ss = str.getBytes("GBK");

    str = new String(ss, "GBK");
    System.out.println(str);

    System.out.println("-------------------------------");
    String   st="好好,学习,天天向上,我好我好大家好";
//    String[] stt=st.split(",");
//    for (String   string: stt) {
//      System.out.println(string);
//    }

   // System.out.println(st.charAt(2));



  }
}
