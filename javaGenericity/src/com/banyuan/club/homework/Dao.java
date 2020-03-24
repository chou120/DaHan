package com.banyuan.club.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/24 9:06 上午
 */
public class Dao<T> {

  private Map<String,T> map=new HashMap<>();
  public void save(String id,T entity){
    map.put(id, entity);//保存数据
  }
  public T get(String id){
   return  map.get(id);
  }
  public  void update(String id,T entity){
    map.replace(id, entity);
  }
  public List<T> list(){
   List  list=new ArrayList();
    Collection con=map.values();//返回的是所有值的集合  集合类型是 Collection
   list.addAll(con); //把集合添加到 list
   return  list;
  }
  public  void delete(String id){
    map.remove(id);
  }
}

class  TestDao{

  public static void main(String[] args) {
    Dao<User>  dao=new Dao<>();
    dao.save("1", new User(12,"沾上干1"));
    dao.save("2", new User(13,"沾上干2"));
    dao.save("3", new User(14,"沾上干3"));
    dao.save("4", new User(15,"沾上干4"));

    dao.delete("4");

    List<User> list=dao.list();
    for (User   u:list) {
      System.out.println(u.toString());
    }




  }
}
