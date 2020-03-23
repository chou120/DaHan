package com.banyuan.club.genericity;

import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 3:32 下午
 */
public class PetHouse<T> {

  private List<T> list;  //虽然也是一个通配符 但是  在编译的时候就已经确定了类型   所有 list集合可以添加数据

  public PetHouse() {
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }

  public   void  add(T item){
    list.add(item);
  }

  public  T get(){
    return  list.get(0);
  }



}
