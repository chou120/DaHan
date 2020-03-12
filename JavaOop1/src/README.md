### 类是java的一个基本单元
### 类是由什么构成的?
####  类里面包含: 函数,全局变量     包含 代码块... 还可以包含类...

Car s = new Car();

1 加载Car类文件到栈内存，开辟空间。

2 在栈内存为s开辟空间

3 在堆内存为Car对象开辟空间

4 给Car的成员变量分配默认值

5 如果成员变量有给定值则用给定值覆盖默认值

6 通过构造方法给成员变量赋值

7 把Car对象在堆内存的地址值赋给s变量
![avatar](/Users/sanye/Desktop/whiteboard.png)

/*
作业1:
请通过代码封装，实现如下需求（使用属性隐藏和属性不隐藏的方式来实现下面的需求）：
编写一个类Book，代表教材:
具有属性：名称（title）、页数（pageNum），其中页数不能少于200页，否则输出错误信息，并赋予默认值200
为各属性设置赋值和取值方法
具有方法:detail，用来在控制台输出每本教材的名称和页数
编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确

作业2:
实现封装的具体步骤如下：  (自己想如何去封装一个标准的封装类)
1.修改属性的可见性来限制对属性的访问，一般设为 private。
2.为每个属性创建一对赋值（setter）方法和取值（getter）方法，一般设为 public，用于属性的读写。
3.在赋值和取值方法中，加入属性控制语句（对属性值的合法性进行判断


作业3：现在有五个学生,每个学生有4门课程  语文  数学 英语  理科综合,还有姓名属性
要求:1.求出平均分最高的人的所有信息
    2.找出理科成绩最高的人
         
*/



```text
static：
    1.被static修饰的成员 优先于对象加载
    2.被所有的类的对象共享
    3.静态只能静态的成员
    4.非静态可以访问静态和非静态成员
    
```

```java

class  Fu{
    public int num=10;
    public  Fu(){
      System.out.println("我是你爹..."); 
    } 
  }
class Son  extends Fu{
    public int num=20;
    public Son(){
        System.out.println("我是你儿子..."); 
     }   
    public void show(){   
      int  num=56;
       System.out.println(num); 
       System.out.println();  //this.num
       System.out.println();  //super.num
     }
}      
class  Test{
    main(){
    Son son=new Son();
      son.show();  //最终得到的结果是     56      20     10
}
}
//--------------------------------------

class  Fu{
    static{
      System.out.println("静态代码块Fu..."); 
    }
    {
      System.out.println("构造代码块Fu...."); 
    }
    public  Fu(){
      System.out.println("无参构造代码块Fu..."); 
    }
  }
class Son  extends Fu{
    static{
          System.out.println("静态代码块Son..."); 
        }
        {
          System.out.println("构造代码块Son...."); 
        }
        public  Son(){
          System.out.println("无参构造代码块Son..."); 
        }
    main(){
    Son  son=new  Son();//求最终输出的结果
}

}      
// ------------------------------
class  X{ 
        Y  y=new  Y();
        X(){
            System.out.println("X"); 
          }   
}
class Y{
          Y(){
            System.out.println("Y"); 
          } 

}
class Z extends X{
        Y  y=new  Y();
          Z(){
            System.out.println("Z"); 
          } 

}

//求   new  Z();最终结果


```
```text
继承的好处:
    1.提高了代码的复用性
        ---多个类中有相同的成员可以放到一个类中
    2.提高了代码的维护性
        --- 如果功能的代码需要修改 那么只需要修改一处即可
    3.让类与类之间产生了关系,是多态的前提  
        --- 是好处也是弊端: 类与类之间的耦合性更强了
     
     高内聚:就是自己能完成某件事的能力 （如果能在一个类中完成就尽量在一个类里面完成）   
     低耦合:降低类与类之间的关系
   
    不好:使用继承打破了封装性
         ---如果想要父类的属性   在调用者和里面 创建父类对象调用公共的访问方法去访问
         ---但是在子类里面不需要创建父类对象就可以直接去调用父类的公共的访问方法区调用父类的属性
    
    什么时候使用继承？(使用继承的注意事项)
        1.多个类中有相同的成员可以放到一个类中
        2.不能为了部分的功能去继承
            class  Fu{
                  test(){
                  
                  }
                  show(){
                  
                  }
                     ...  有是个 
              }
            class   Son extends Fu{
              //只想用其中一个 
              
            }
           

```







