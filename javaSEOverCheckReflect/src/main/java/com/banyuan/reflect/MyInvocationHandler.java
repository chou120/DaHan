package com.banyuan.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Scanner;
import java.util.UUID;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/8 11:01 上午
 */
public class MyInvocationHandler  implements InvocationHandler {
  Scanner  sc=new Scanner(System.in);
  //目标代理对象
  StudentDao  studentDao;

  public MyInvocationHandler(StudentDao studentDao) {
    this.studentDao = studentDao;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    //在调用目标之前进行邮箱验证

    Student  student=(Student)args[0];
    System.out.println(student.toString());

    String   str=checkEmail(student);
    System.out.println("请输入验证码:");
    String  checkEmail=sc.next().trim();
    if(checkEmail.equals(str)){
      Object  object=method.invoke(studentDao, args);

      //在login之后记录下日志 什么时间点 如果有能力的话可以获取一个网络的ip 等这些重要信息写入一个日志文件里面
      //在某一个方法执行之后 如果有什么错误,把错误的信息导入日志文件中一般的错误信息包含 发生错误的代码位置和时间和错误的原因

      return object;
    }

    System.out.println("验证码不一致");
      return false;
  }




  //邮箱验证的方法
  public  String checkEmail(Student  student) throws MessagingException {
    System.out.print("Mail sending......");

    Properties properties = new Properties();
    properties.put("mail.transport.protocol", "smtp");// 连接协议
    properties.put("mail.smtp.host", "smtp.qq.com");// 主机名
    properties.put("mail.smtp.port", 465);// 端口号
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.ssl.enable", "true");// 设置是否使用ssl安全连接, 一般都使用
    properties.put("mail.debug", "true");// 设置是否显示debug信息 true 会在控制台显示相关信息

    Session session = Session.getInstance(properties); // 得到回话对象

    Message message = new MimeMessage(session); // 获取邮件对象
    message.setFrom(new InternetAddress("1208160221@qq.com")); // 设置发件人邮箱地址
    message.setRecipients(Message.RecipientType.TO, new InternetAddress[] {
        //TO表示主要接收人，CC表示抄送人，BCC表示秘密抄送人
        new InternetAddress(student.getEmail()),
    }); // 设置收件人邮箱地址
    message.setSubject("xxx网站注册验证"); // 设置邮件标题

    String  uuid= UUID.randomUUID().toString();
    message.setText("验证码如下:"+uuid); // 设置邮件内容

    Transport transport = session.getTransport(); // 得到邮差对象
    transport.connect("1208160221@qq.com", "ckggssygpseziegh");
    transport.sendMessage(message, message.getAllRecipients());  // 发送邮件
    transport.close();
    System.out.println("Done.");
    return uuid;
  }






}
