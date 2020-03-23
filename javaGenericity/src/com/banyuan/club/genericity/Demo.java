package com.banyuan.club.genericity;

import com.banyuan.club.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.sql.rowset.CachedRowSet;
import sun.jvm.hotspot.oops.ObjArray;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 3:20 下午
 */
public class Demo {


  //通配符
  public   static  void  get(PetHouse<? extends Cat>  p){

    System.out.println(p.get());
  }

  //给泛型方法添加一个限定的类型
  public    static <T extends Animal> void  show6(T t){



  }




  //  小知识点  泛型擦除
  public static void main(String[] args) {
//    ArrayList<Integer>  list=new ArrayList<>();
//    ArrayList<String>  list2=new ArrayList<>();

//    System.out.println(list.getClass()==list2.getClass());


    PetHouse<Animal>  petHouse=new PetHouse<>();
    petHouse.add(new Cat1());
    petHouse.add(new Cat());
    petHouse.add(new Dog());
    //petHouse.add();

//    PetHouse<? extends  Cat> petHouse0=new PetHouse<>();
//    petHouse1.add(new Cat());   // ？得到的是实参
//    petHouse1.add(new  Cat1());
//    petHouse1.add(new  Animal());
//    petHouse1.add(new  Object());





    PetHouse<? super   Cat> petHouse1=new PetHouse<>();
    petHouse1.add(new Cat());
   // petHouse1.add(new  Animal());
    petHouse1.add(new Cat1());
    //petHouse1.add(new  Dog());

    //? extends Cat 当使用这个通配符限定数据类型的是   编译器只知道是Cat类及其子类  但是 具体的是一个数据类型
    //根本不清楚  只是看到了extends后面 Cat类  有一个叫 占位符的   但是根本不知道是不是和这个占位符匹配 编译器干脆就不让插入

    // ? super Cat  限定了最先的类型    已经限定占位符大小  有数据插入的时候 如果在范围内 默认就能插入
    //取出数据的时候根本不知道什么类型 所以干脆就返回一个Object   这样就容易造成数据丢失了

    /*
      1.频繁的往外读取内容的时候 适合使用  extends
      2.经常往里面插入的时候 使用适合  super

      上界不存 下界不取

     */

    List<Cat1> list=new ArrayList<>();

    List<? extends  Cat>    list1=list;

    PetHouse<Cat>  petHouse2=new PetHouse<>();
    petHouse2.add(new Cat());
    petHouse2.add(new Cat1());
    petHouse2.add(new Cat1());

    get(petHouse2);




    show6(new  Cat());



  }
}
class Animal{


}
class  Cat extends  Animal{

}
class  Dog extends  Animal{

}

class  Cat1  extends Cat{

}






