package com.banyuan.homework5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 10:14 上午
 */
public class Server implements Runnable {

  private ServerSocket serverSocket;

  public Server(ServerSocket serverSocket) {
    this.serverSocket = serverSocket;
  }

  @Override
  public void run() {
    while(true){
      synchronized (this){
        try {
          Socket s = serverSocket.accept();
          InputStream is = s.getInputStream();
          //UUID 生成唯一的序列号
          String   fileName= UUID.randomUUID().toString()+".jpg";
          File file=new File("image/"+fileName);
          if(!file.exists()){
            file.createNewFile();
          }
          OutputStream  os=new FileOutputStream(file);
          byte [] by= new  byte[1024];
          long  start=System.currentTimeMillis();
          int len=-1;
          while((len=is.read(by))!=-1){
            os.write(by,0,len);
          }
          long  end=System.currentTimeMillis();

          System.out.println("上传一个文件需要的时间为:"+(end-start));

          os.close();
          is.close();

        } catch (IOException e) {
          e.printStackTrace();
        }
      }

    }

  }


}
