package com.banyuan.club.genericityInteface2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 2:11 下午
 */
public class FunctionImpl  implements Function {

  List<Person>   list=new ArrayList<>();


  @Override
  public void add(Person p) {
        list.add(p);
  }

  @Override
  public boolean delete(String name) {
    int  key=-1;
//    for (int i = 0; i <list.size(); i++) {
//      if(name.equals(list.get(i).getName())){
//            //key=i;
//        list.remove(i);
//        return  true;
//      }
//    }

    //如果以后你们使用foreach来对集合数据进行操作  可能会发生  并发异常  不建议使用这中方式
    for (Person  p:list) {
      if(p.getName().equals(name)){
        list.remove(p);
        return true;
      }
    }
//    Person  p=list.remove(key);
    //if(p!=null){

   // }

    return false;
  }

  @Override
  public void update(String name) {

  }

  @Override
  public Person queryByData(Person person) {
    for (int i = 0; i <list.size(); i++) {
      if(list.contains(person)){
          return   list.get(i);
      }
    }
    return null;
  }
}
