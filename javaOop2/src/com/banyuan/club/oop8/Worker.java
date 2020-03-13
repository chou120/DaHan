package com.banyuan.club.oop8;


import com.sun.corba.se.spi.orbutil.threadpool.Work;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/13 2:35 下午
 */
public class Worker {

    public   String   name="我不好";

    public  class  Inner{

      public   String   name="你好";
      public  void  show(){
        System.out.println("我是内部类,并且是私有化的...."+name);
      }

//      public   String  getName(){
//        return name;
//      }

    }

//    public  void  getInner(){
//       new   Inner().show();
//    }


  public class  Inner1  extends  Function{

    @Override
    public String getChange(String name) {
      return null;
    }
  }

  public  class  Inner2  extends  Function1{

    @Override
    public String getPassword(String type) {
      return null;
    }
  }




}
class  TestWorker{

  public static void main(String[] args) {
    Worker.Inner wo=new  Worker().new  Inner(); //还是首先要创建外部类对象
    Worker  worker=new Worker();
    System.out.println(worker.name+"-----"+wo.name);

  }

}



