package com.banyuan.club.oop6;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 11:29 上午
 */
public enum WeekDay {
  //常用2
    MON("周一",0),TUE("TuesDay",1),Wed("WednesDay",2),Thu("THURSDAY",3),Fri("FRIDAY",4),
    Sat("周六",5),Sun("周日",6);
  private  final String  day;
  private  int   index;

  WeekDay(String day,int  index) {  //构造器是私有
    this.day = day;
    this.index=index;
  }
  public  static  void  printDay(int  i){
      switch (i){
        case 0:
          System.out.println(WeekDay.MON);
          break;
        case 1:
          System.out.println(WeekDay.TUE);
          break;
        case 2:
          System.out.println(WeekDay.Wed);
          break;
        case 3:
          System.out.println(WeekDay.Thu);
          break;
        case 4:
          System.out.println(WeekDay.Fri);
          break;
        case 5:
          System.out.println(WeekDay.Sat);
          break;
        case 6:
          System.out.println(WeekDay.Sun);
          break;
      }

  }

  public  String  getDay(){
    return day;
  }

}


class  TestEnum_Test{

  public static void main(String[] args) {
    for (WeekDay  w:WeekDay.values()) {
      System.out.println(w+"------->>>>>"+w.getDay());
    }

    WeekDay.printDay(2);


  }
}
