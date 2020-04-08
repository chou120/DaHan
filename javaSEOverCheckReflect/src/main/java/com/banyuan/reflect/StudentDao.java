package com.banyuan.reflect;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/8 10:46 上午
 */
public interface StudentDao {

  boolean  login(String name,String password);

  void  register(Student  student);

}
