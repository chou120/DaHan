package com.banyuan.homework4;

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
 * @date 2020/4/2 9:55 上午
 */
//上传图片案例
public class Send {

  public static void main(String[] args) throws IOException {
    File file = new File("img/timg.jpeg");
    InputStream  inputStream=new FileInputStream(file);
    byte[] bytes=new byte[(int)file.length()];
    inputStream.read(bytes);
    inputStream.close();

    Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 5566);
    OutputStream os = socket.getOutputStream();
    os.write(bytes);
    os.close();

    //作业提高:不去指定图片  获取指定文件夹下面的所有的图片然后进行上传到服务器



  }

}
