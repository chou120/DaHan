package com.banyuan.tcp2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/1 3:49 下午
 */
public class Send {

  public static void main(String[] args) throws IOException {

    Socket socket = new Socket("192.168.11.149", 1234);

    OutputStream os = socket.getOutputStream();
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    os.write(str.getBytes());
    if (str.contains("1")) {
      socket.shutdownOutput();
    }
    os.close();


  }

}
