package com.banyuan.homework5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/2 10:13 上午
 */
public class Send {
  /*
      服务器的代码用线程进行封装，这样可以模拟一个同时接收多人上传文件的服务器。
   */
  public static void main(String[] args) throws IOException {
    Socket  socket=new Socket(InetAddress.getLocalHost().getHostAddress(),5566);
    OutputStream  os=socket.getOutputStream();
    File file=new File("img/1.jpg");
    InputStream is=new FileInputStream(file);
    byte [] by=new byte[(int)file.length()];
    is.read(by);
    os.write(by);

    os.close();
    is.close();


  }

}
