package com.banyuan.club.Homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/16 9:47 上午
 */
public class Company {

  Employee  [] employee=new  Employee[6];
  //   接口多态来接收子类类型的对象  但是有三种不同的子类对象
  static   int count=0;

  public  void  addEmp(Employee  emp){
      employee[count++]=emp;
  }

  public  void   delGetByEmpName(String  name,Employee  emp){ //判断一下是属于哪个工种
    int  index=-1;
    for (int i = 0; i <count; i++) {
        if(employee[i]  instanceof  HourEmp  && emp instanceof HourEmp){
          //   instanceof  表示判断数据类型
          /*
               Employee  [] employee=new  Employee[6]; 接口多态  所有的接口子实现类都可以存放到这个数组里面
               Employee   emp=new   HourEmp();
                          emp=new   Man();
               子类对象存放在父类类型创建数组空间里    子类会被默认提升类型

               此时得用  instanceof  判断 数组里面的对象到底是属于哪个一个类的

           */

          HourEmp  hourEmp=((HourEmp)employee[i]);
          if(name.equals(hourEmp.getName())){
            index=i;
          }
        }else if(employee[i]  instanceof  SalEmp  && emp instanceof SalEmp){
          String  eName=((SalEmp)employee[i]).getName();
          if(name.equals(eName)){
            index=i;
          }
        }else  if(employee[i]  instanceof  Man  && emp instanceof Man){
          String  eName=((Man)employee[i]).getName();
          if(name.equals(eName)){
            index=i;
          }
        }
    }

    for (int i = index; i < count; i++) {
      if(count==employee.length) {
        employee[i]=null;
      }else{
        employee[i] = employee[i + 1];
      }

    }
    count--; //人数少一个

  }
  //通过员工的名字显示员工的工资
  public   double   getSalary(String   ename){



    return 0;
  }


  public  double   getSalarySum(){
  double  sum=0;
    for (int i = 0; i <count; i++) {
      double money = employee[i].calMoney();
      sum += money;
    }
    return     sum;
  }


  //自己尝试写一个数组扩容的方法


}
