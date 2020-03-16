package com.banyuan.club;

import java.util.Objects;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 1:39 下午
 */
public class Person {

  private   String   IDCard;
  private   String   username;
  private   String   address;


  public Person(String IDCard, String username, String address) {
    this.IDCard = IDCard;
    this.username = username;
    this.address = address;

  }

  public Person() {
  }

  public String getIDCard() {
    return IDCard;
  }

  public void setIDCard(String IDCard) {
    this.IDCard = IDCard;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  //重写  equals()

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(IDCard, person.IDCard) &&
        Objects.equals(username, person.username) &&
        Objects.equals(address, person.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IDCard, username, address);
  }

//  @Override
//  public boolean  equals(Object  object){
//    boolean  flag=false;
//  //首先来判断一下 如果传递过来的是  null  你们觉得还有必要进行比较嘛
//  if(object ==null){
//    return flag;
//  }
//  //如果不为空  继续判断
//    if(!(object  instanceof  Person)){
//        return  flag;
//    }
//    Person   p=(Person)object;
//  if(this.IDCard.length()==p.getIDCard().length()){
//      if(this.IDCard.equals(p.getIDCard())){
//         flag=true;
//      }
//  }
//    if(this.username.length()==p.getUsername().length()){
//      if(this.username.equals(p.getUsername())){
//         flag=true;
//      }else {
//        flag=false;
//        return  flag;
//      }
//    }else{
//      flag=false;
//      return  flag;
//    }
//
//    if((this.address.length()==p.getAddress().length())){
//      if(this.address.equals(p.getAddress())){
//          flag=true;
//      }else{
//        flag=false;
//        return  flag;
//      }
//
//    }else{
//      flag=false;
//      return  flag;
//    }
//    return    flag;
//  }











  @Override
  public String toString() {
    return "Person{" +
        "IDCard='" + IDCard + '\'' +
        ", username='" + username + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
