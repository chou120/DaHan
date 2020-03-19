package com.banyuan.club.collection;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/18 9:40 上午
 */
public class Person {

  private  String  username;
  private  String  password;

  public Person(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public Person() {
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Person{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
