package com.banyuan.reflect;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/8 10:47 上午
 */
public class StudentDaoImpl implements StudentDao {

  List<Student>  list=new ArrayList<>();

  @Override
  public boolean login(String name, String password) {
    for (int i = 0; i < list.size(); i++) {
          if(list.get(i).getStuName().equals(name.trim())
          &&list.get(i).getPassword().equals(password.trim())){
            System.out.println("欢迎您的登录...");
              return true;
          }
    }
    System.out.println("您还没有账号,请返回注册....");
    return false;
  }

  @Override
  public void register(Student student) {
      list.add(student);
  }
}
