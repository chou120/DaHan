package com.banyuan.test;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/7 9:13 上午
 */
public class Test {

  public static void main(String[] args) {





  }



  public  void show(){

   final String name="张三";  //jdk 1.7之前 final必须加的   但是jdk1.7之后 final省略

    class Study{
      public  void  method(){
        System.out.println("哈哈哈"+name);
      }
    }
    Study  study=new Study();
    study.method();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
