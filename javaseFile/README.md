```text
作业1: 找到指定文件夹下面的所有的满足 .java 文件
作业2：把写入进去的文件内容  读取出来 并且把读取出来的数据 原封不动的赋值回去  例如:"张三"--set->name  23-set-->age
      把对象的属性值写入文件   然后读取文件所有的数据  
        /*
            比如说读取以下内容:
                      姓名:张三,年龄:23
                      姓名:刘亦菲,年龄:29
                      姓名:艾弗森,年龄:39
                      姓名:詹姆斯,年龄:25
          */
      把姓名和年龄对应的数据 赋值给某个对象  让指定的对象 有数据   Person p=new  Person();
                                                         p.setName(读取的姓名);
                                                         p.setAge(读取的年龄);
          输出该对象的信息


作业3: 读取指定文件下(包括子文件)的所有的txt结尾的文件的内容并且显示     
      dahan/   xxx.java
               xxx.txt
              donghan/xxx.txt
              donghan/xihan/xxx.txt
                ....
              以此类推  读取所有的 txt文件内容

```
```
安装maven步骤
    
    使用homebrew 安装maven
    brew cask install maven 或者 brew install maven
    安装成功之后 使用
    打开.bash_profile 文件 open .bash_profile
    在里面加入
    export M2_HOME=/usr/local/opt/maven@3.6
    export M2=$M2_HOME/bin
    export PATH=$M2:$PATH
    mvn -v 查看maven 版本号 如果有显示版本号就说明成功了



JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home
PATH=$JAVA_HOME/bin:$PATH:
export JAVA_HOME
export PATH

export M2_HOME=/usr/local/opt/maven@3.6
export M2=$M2_HOME/bin
export PATH=$M2:$PATH 
export HOMEBREW_BOTTLE_DOMAIN=https://mirrors.ustc.edu.cn/homebrew-bottles


      
```



