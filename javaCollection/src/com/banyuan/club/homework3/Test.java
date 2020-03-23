package com.banyuan.club.homework3;

import java.util.List;
import java.util.Scanner;
import sun.tools.jstat.Scale;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 10:27 上午
 */
public class Test {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 3;
    while (count > 0) {
      System.out.println("请输入姓名:");
      String name = scanner.next();
      System.out.println("请输入密码:");
      String password = scanner.next();
      Student stu = Util.login(name, password);
      if (stu != null) {//当login之后返回是数据不是 null 就继续考试
        List arr = Util.questionList();//答一题显示一题
        //统计分数
        Double score = 0.0;
        for (int i = 0; i < arr.size(); i++) {
          //首先是显示题目
          Questions questions = (Questions) arr.get(i);
          System.out.println(
              "题号:" + questions.getqId() + "." + questions.getqTitle() + "\n" + questions
                  .getChoiceA()
                  + "\t" + questions.getChoiceB() + "\t" + questions.getChoiceC() + "\t" + questions
                  .getChoiceD());
          System.out.print("请输入答案:");
          String answer = scanner.next();
          if (answer.equalsIgnoreCase(questions.getChoiceAnswer())) {
            //如果选项是一模一样的答案  那么就给该考试的学生添加分数  一题10分
            score += 10;
          }
        }
        //做题完成之后 给当前登录的学生赋值分数 问题:当前学生是谁？
        stu.setScore(score);
        //集合里面的学生数据没变 进行修改
        Object obj = Util.update(stu);
        if (obj != null) {
          System.out.println("学生数据修改成功...考试结束");
          break;
        } else {
          System.out.println("学生数据修改失败...");
        }
      } else {

        if (count != 0) {
          System.out.println("账户或密码不正确,您还有" + (--count) + ",请重新输入...");
        } else {
          System.out.println("你输入的次数已经超过三次...程序结束...");
          System.exit(0);
        }
      }
    }
    //考试结束你们还可以查询一下啊自己的成绩   如果对于成绩不满意还可以继续进行考试
  }
}
