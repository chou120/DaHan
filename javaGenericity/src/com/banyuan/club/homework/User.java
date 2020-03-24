package com.banyuan.club.homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/24 9:13 上午
 */
public class User {

  private  Integer id;
  private  String name;

  public User(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public User() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
