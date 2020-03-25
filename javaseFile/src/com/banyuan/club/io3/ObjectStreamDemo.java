package com.banyuan.club.io3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/25 1:32 下午
 */
public class ObjectStreamDemo {

  /*
     序列化:是编程以一种形式将对象数据保存在输出流(网络)中  这种叫对象序列化
     反序列化:编程按照一种形式从读入流中将对象数据读取出来  这叫对象反序列化

   */

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ObjectOutputStream  objectOutputStream =
        new ObjectOutputStream(new FileOutputStream(new File("test/1.txt")));
        objectOutputStream.writeObject(new  Person("王五",23));
        objectOutputStream.flush();
        objectOutputStream.close();

    ObjectInputStream  objectInputStream=new ObjectInputStream(new FileInputStream(new File("test/1.txt")));
    Object object=objectInputStream.readObject();
    Person  person=(Person)object;

    System.out.println(person.getAge());


    /*
        内存流   随机流 等等... 自己科普一下 见Books 里面核心卷2

     */




  }


}
