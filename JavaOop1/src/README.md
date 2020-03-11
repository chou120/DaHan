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

```text


```




