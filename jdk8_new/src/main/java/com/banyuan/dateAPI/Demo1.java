package com.banyuan.dateAPI;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/7 10:56 上午
 */
public class Demo1 {

  public static void main(String[] args) {
    //静态方法，根据当前时间创建对象
//    LocalDateTime ldt = LocalDateTime.now();
//    System.out.println(ldt);
//
//    //静态方法，根据指定日期/时间创建对象
//    LocalDateTime ld2 = LocalDateTime.of(2016, 11, 21, 10, 10, 10);
//   // System.out.println(ld2);
////
//    LocalDateTime ldt3 = ld2.plusYears(20);
//   // System.out.println(ldt3);
////
//    LocalDateTime ldt4 = ld2.minusMonths(2);
   // System.out.println(ldt4);
//
//    System.out.println(ldt.getYear());
//    System.out.println(ldt.getMonthValue());
//    System.out.println(ldt.getDayOfMonth());
//    System.out.println(ldt.getHour());
//    System.out.println(ldt.getMinute());
//    System.out.println(ldt.getSecond());


//    Instant ins = Instant.now();  //默认使用 UTC 时区
//    System.out.println("----"+ins);
//
//    OffsetDateTime odt = ins.atOffset(ZoneOffset.ofHours(8));
//    System.out.println(">>>>>>>"+odt);
//
//   // System.out.println("++++"+ins.getNano());
//
//    Instant ins2 = Instant.ofEpochSecond(100);
//
//    System.out.println("+-+-+-"+ins2);
//


    //计算两个时间间隔
//    Instant ins1 = Instant.now();
//
//    System.out.println("--------------------");
//    try {
//      Thread.sleep(3000);
//    } catch (InterruptedException e) {
//    }
//
//    Instant ins2 = Instant.now();
//
//    System.out.println("所耗费时间为：" + Duration.between(ins1, ins2));
//
//    System.out.println("----------------------------------");
//
//
//    LocalDate ld1 = LocalDate.now();
//    LocalDate ld2 = LocalDate.of(2011, 1, 1);
//
//    Period pe = Period.between(ld2, ld1);
//    System.out.println(pe.getYears());
//    System.out.println(pe.getMonths());
//    System.out.println(pe.getDays());



    //时间校正
//    LocalDateTime ldt = LocalDateTime.now();
//    System.out.println(ldt);

    //这个月过去了十天
//    LocalDateTime ldt2 = ldt.withDayOfMonth(10);
//    System.out.println(ldt2);
//
//    //把时间天调整到接下来的一个周日
//    LocalDateTime ldt3 = ldt.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
//    System.out.println(ldt3);
//

    //自定义：下一个工作日
//    LocalDateTime ldt5 = ldt.with((l) -> {
//
//      LocalDateTime ldt4 = (LocalDateTime) l;  //获取当前时间
//      DayOfWeek dow = ldt4.getDayOfWeek();  //获取今天是一周的第几天
//
//      if(dow.equals(DayOfWeek.FRIDAY)){
//        return ldt4.plusDays(3);
//      }else if(dow.equals(DayOfWeek.SATURDAY)){
//        return ldt4.plusDays(2);
//      }else{
//        return ldt4.plusDays(1);  //在原有的基础上加一天
//      }
//    });
//    System.out.println(ldt5);
    //以上的方式使用匿名对象进行时间校正


    //时间的解析与格式化
//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E");
//
//    LocalDateTime ldt = LocalDateTime.now();
//    String strDate = ldt.format(dtf);
//
///**/   System.out.println(strDate);//2020年04月07日 11:26:46 星期二
////
//    //对格式化之后的时间进行解析
//    LocalDateTime newLdt = ldt.parse(strDate, dtf);
//    System.out.println(newLdt);


    Set<String> set = ZoneId.getAvailableZoneIds();
    //set.forEach(System.out::println);

    LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
    System.out.println(ldt);
//
    ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Egypt"));
    System.out.println(zdt);






  }
}
