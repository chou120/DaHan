package com.banyuan.club.oop5_interface;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 10:30 上午
 */
public class Person  implements  Function ,Function1{

  @Override
  public boolean login(String name, String password) {
      if(name.equals("张三")&&password.equals("123456")){
        System.out.println("登录成功....我是"+COUNTRY+"人");
        return  true;
      }
    System.out.println("账户或者密码错误....");
    return false;
  }

  @Override
  public void test() {

  }

  @Override
  public boolean update(String name, String password) {

    return false;
  }
}
