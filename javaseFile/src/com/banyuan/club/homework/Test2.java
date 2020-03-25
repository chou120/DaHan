package com.banyuan.club.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/25 10:08 上午
 */
public class Test2 {

  /*
  2.利用字节流或者换成字符流的方式以指定的格式输入数据
  如:xxx,xxx,xxx,最后一个数据以 .号结束，一行最多五个数据
   */
  public static void main(String[] args) throws IOException {
    File file=new  File("test/1.txt");
    if(!file.exists()){
      file.createNewFile();
    }
    BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
    List<String> list=new ArrayList<>();
    list.add("赵赵");
    list.add("赵小帆");
    list.add("小帆帆");
    list.add("小帆");
    list.add("一帆");
    list.add("赵");
    list.add("一一");
    list.add("帆");
    list.add("小小帆");
    list.add("帆帆");
    list.add("方方");
    list.add("憨憨");
    list.add("小韩子");
    list.add("啦啦");

    for (int i = 0; i <list.size(); i++) {
      bufferedWriter.write(list.get(i));
      if(i!=list.size()-1){
        if((i+1)%5==0){
          bufferedWriter.write(",\n");
        }else{
          bufferedWriter.write(",");
        }
      }else{
        bufferedWriter.write(".");
      }

    }

    bufferedWriter.close();



  }


}
