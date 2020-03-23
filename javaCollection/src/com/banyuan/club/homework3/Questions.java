package com.banyuan.club.homework3;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/23 10:07 上午
 */
public class Questions {

  private Integer qId;  //增长
  private String qTitle;
  private String  choiceA;
  private String  choiceB;
  private String  choiceC;
  private String  choiceD;
  private String  choiceAnswer;

  public Questions() {
  }

  public Questions(Integer qId, String qTitle, String choiceA, String choiceB,
      String choiceC, String choiceD, String choiceAnswer) {
    this.qId = qId;
    this.qTitle = qTitle;
    this.choiceA = choiceA;
    this.choiceB = choiceB;
    this.choiceC = choiceC;
    this.choiceD = choiceD;
    this.choiceAnswer = choiceAnswer;
  }

  public Integer getqId() {
    return qId;
  }

  public void setqId(Integer qId) {
    this.qId = qId;
  }

  public String getqTitle() {
    return qTitle;
  }

  public void setqTitle(String qTitle) {
    this.qTitle = qTitle;
  }

  public String getChoiceA() {
    return choiceA;
  }

  public void setChoiceA(String choiceA) {
    this.choiceA = choiceA;
  }

  public String getChoiceB() {
    return choiceB;
  }

  public void setChoiceB(String choiceB) {
    this.choiceB = choiceB;
  }

  public String getChoiceC() {
    return choiceC;
  }

  public void setChoiceC(String choiceC) {
    this.choiceC = choiceC;
  }

  public String getChoiceD() {
    return choiceD;
  }

  public void setChoiceD(String choiceD) {
    this.choiceD = choiceD;
  }

  public String getChoiceAnswer() {
    return choiceAnswer;
  }

  public void setChoiceAnswer(String choiceAnswer) {
    this.choiceAnswer = choiceAnswer;
  }

  @Override
  public String toString() {
    return "Questions{" +
        "qId=" + qId +
        ", qTitle='" + qTitle + '\'' +
        ", choiceA='" + choiceA + '\'' +
        ", choiceB='" + choiceB + '\'' +
        ", choiceC='" + choiceC + '\'' +
        ", choiceD='" + choiceD + '\'' +
        ", choiceAnswer='" + choiceAnswer + '\'' +
        '}';
  }
}
