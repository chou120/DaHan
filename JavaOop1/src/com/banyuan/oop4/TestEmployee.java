package com.banyuan.oop4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/10 11:03 上午
 */
public class TestEmployee {


  public static void main(String[] args) {
    Employee  emp=new Employee();
    emp.setEmpIDCard("1242212321132X");
    emp.setEmpName("章鱼");
    emp.setEmpNumber("9527");

    Department  department=new Department();
    department.setDepartmentNumber("9527");
    department.setDepartmentName("研发部");
    department.setDepartmentAddress("召唤师峡谷红buff旁边");

    emp.setDepartment(department); //设置的是一个对象


    Employee  emp2=new Employee();
    emp2.setEmpIDCard("4221232113299");
    emp2.setEmpName("章鱼3");
    emp2.setEmpNumber("9528");

    Department  department2=new Department();
    department2.setDepartmentNumber("9528");
    department2.setDepartmentName("后勤部");
    department2.setDepartmentAddress("召唤师峡谷蓝buff旁边");

    emp2.setDepartment(department2);

    System.out.println(emp2.toString());


    //  现在的两个员工对象 都有对Department的引用


    //  一个员工一个部门      那么 一部门里面的 有多个员工
    // 要求:两个部门  一个研发部 一个后勤部
    // 在控制台显示 两个部门的所有的信息以及该部门下的所有的 员工信息
    /* 如下显示:
        研发部  xxxx    xxxx    xxx
                员工1{  } ,员工2{  }
        后勤部  依次类推

      */


  }

}
