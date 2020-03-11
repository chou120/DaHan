package com.banyuan.homework2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/11 9:34 上午
 */
public class Question {
  //试题编号number,试题内容title,试题选项 answerA  anwserB anwserC anwserD  试题答案  Anwser
  private  int  number;
  private  String  title;
  private  String  answerA="A";
  private  String  answerB="B";
  private  String  answerC="C";
  private  String  answerD="D";
  private  String  answer;  //答案

  public Question(int number, String title, String answerA, String answerB, String answerC,
      String answerD, String answer) {
    this.number = number;
    this.title = title;
    this.answerA = answerA;
    this.answerB = answerB;
    this.answerC = answerC;
    this.answerD = answerD;
    this.answer = answer;
  }


  public Question() {
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAnswerA() {
    return answerA;
  }

  public void setAnswerA(String answerA) {
    this.answerA = answerA;
  }

  public String getAnswerB() {
    return answerB;
  }

  public void setAnswerB(String answerB) {
    this.answerB = answerB;
  }

  public String getAnswerC() {
    return answerC;
  }

  public void setAnswerC(String answerC) {
    this.answerC = answerC;
  }

  public String getAnswerD() {
    return answerD;
  }

  public void setAnswerD(String answerD) {
    this.answerD = answerD;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  @Override
  public String toString() {
    return "Question{" +
        "number=" + number +
        ", title='" + title + '\'' +
        ", answerA='" + answerA + '\'' +
        ", answerB='" + answerB + '\'' +
        ", answerC='" + answerC + '\'' +
        ", answerD='" + answerD + '\'' +
        ", answer='" + answer + '\'' +
        '}';
  }
}
