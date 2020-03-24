package com.banyuan.club.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/24 3:01 下午
 */
public class Demo3 {

  //文件内容复制
  public static void main(String[] args) {
    File file = new File("test/had/pro/妹子.jpeg");
    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    File file2 = new File("/Users/sanye/img/timg.jpeg");
    byte[] by = new byte[(int) file2.length()];
    InputStream inputStream = null;
    try {
      inputStream = new FileInputStream(file2);
      inputStream.read(by);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (inputStream != null) {
        try {
          inputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

    //写入数据
    OutputStream outputStream = null;
    try {
      outputStream = new FileOutputStream(file);
      outputStream.write(by);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (outputStream != null) {
        try {
          outputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }


    }
  }
}
