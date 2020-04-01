package com.banyuan.tcp2;

import com.banyuan.udpChatting.ReceivedThread;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/1 4:34 下午
 */
public class TestReceived {

  public static void main(String[] args) {
    ServerSocket serverSocket = null;
    Socket s = null;
    InputStream is=null;
    OutputStream os=null;

    try {
      serverSocket = new ServerSocket(1234);
    } catch (IOException e) {
      e.printStackTrace();
    }

    while(true){

      try {
        s = serverSocket.accept();
        is = s.getInputStream();
        os = s.getOutputStream();

        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String str = new String(bytes, 0, len);

        s.shutdownInput();
        //在接受中断读取流,没有太大影响,为什么？ 因为每次都会去重新创建一个Socket对象
        //反馈给客户端的信息
        System.out.println("接收到数据为:" + str);
        os.write("服务器端接收到了...".getBytes());
        os.flush();

      } catch (IOException e) {
        e.printStackTrace();
      }

    }

  }

}
