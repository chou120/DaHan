package com.banyuan.homework;

import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 9:24 上午
 */
public class Test1 {

  /*
  作业3：现在有五个学生,每个学生有4门课程  语文  数学 英语  理科综合,还有姓名属性
      要求:1.求出平均分最高的人的所有信息
          2.找出理科成绩最高的人
   */
  public static void main(String[] args) {
    String[] str = new String[4];  //创建的是引用数据类型的数组
    str[0] = "哈哈啥事";

    //   八大基本数据类型    还有引用类型       类    接口   数组  等等
    // 创建对象数组      类名[] 变量名=new 类名[数组长度];

//    Student st = new Student();
//    st.setStuName("张三");
//    st.setChinese(45);
//    st.setScience(278);
//    st.setEnglish(35.6);
//    st.setMath(145);
//    stu[0] = st;
//
//    Student st2 = new Student();
//    st2.setStuName("李四");
//    st2.setChinese(50);
//    st2.setScience(278);
//    st2.setEnglish(35.6);
//    st2.setMath(145);
//    stu[1] = st2;

    Student[] stu = new Student[3]; //装五个学生学生对象
    //使用循环的方式给数组赋值
    Scanner  sc=new Scanner(System.in);
    for (int i = 0; i < stu.length; i++) {
      Student  st=new Student();
      System.out.println("请输入第"+(i+1)+"个学生的姓名:");
      st.setStuName(sc.next());
      System.out.println("请输入第"+(i+1)+"个学生的成绩:");
      double math=sc.nextDouble();
      st.setMath(math);
      double eng=sc.nextDouble();
      st.setEnglish(eng);
      double ch=sc.nextDouble();
      st.setChinese(ch);
      double science=sc.nextDouble();
      st.setScience(science);
      stu[i]=st;
    }

    //得到平均分最高
    int  index=0;
    double   max=stu[0].getAvgScore();//假设默认的是第一个数据
    for (int i = 1; i < stu.length; i++) {
      if(max<stu[i].getAvgScore()){
        max=stu[i].getAvgScore(); //得到平均分最大值其实就是得到具体的哪个对象
        index=i;//得到 平均分最大值的下标
      }
    }
    System.out.println("平均分最大值的人所有的信息如下:"+stu[index].toString());

  }
}
