package com.banyuan.club.oop7;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 2:01 下午
 */
public class TestAnimal {


  public static void main(String[] args) {
    Animal  animal=new AnImpl();
    String  str=animal.getDataByName("张三丰");
    System.out.println(str);

    //这个时候发现  知道整个程序结束   该方法只被调用了一次

//    Animal  animal1=new Animal() {
//      @Override
//      public String getDataByName(String name) {
//        name+="你刚刚干嘛去了?";
//        return name;
//      }
//    };
//
//    str= animal1.getDataByName("高新光");
//    System.out.println(str);
//
//
//    new Animal() {  //并且这个匿名对象就被垃圾回收
//      @Override
//      public String getDataByName(String name) {
//        name+="你刚刚干嘛去了?";
//        return name;
//      }
//    }.getDataByName("孙可可");


      Animal  animal1=new Animal() {  //因为该抽象类里面的方法实现根本没有一个具体的实现类
        @Override
        public String getDataByName(String name) {
          return null;
        }

        @Override
        public String getDataByAge(int age) {
          return null;
        }

        @Override
        public String deDataByName(String name) {
          return null;
        }
      };

      animal1.deDataByName("");
      animal1.getDataByName("");




  }

}
