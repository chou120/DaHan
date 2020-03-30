package com.banyuan.club.reflectdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/30 2:16 下午
 */
public class ReflectDemo1 {

  public static void main(String[] args) {
    // 获取class文件的方法
//    Person   person=new Person();
//    Class<Person>  clazz=(Class)person.getClass();

    //第二种方式
    Class<Person> clazz = Person.class;

    //第三种方式
    try {
      //括号里面的 字符串所对应的类  必须是  the fully qualified name of the desired class.
      clazz = (Class) Class.forName("com.banyuan.club.reflectdemo.Person");  //给一个类的具体路径
      //  System.out.println(clazz.getName());

      //获取 Person 类的构造方法并且使用构造方法操作数据...
      Constructor con = clazz.getConstructor();
      Object obj = con.newInstance();   //通过无参构造器获取对象
      // System.out.println(obj.toString());

      //使用有参构造器
//      con = clazz.getConstructor(String.class, int.class);
//      obj = con.newInstance("wangwu", 45);
//      System.out.println(obj);

      //获取所有的构造器...
      // Constructor[] cons = clazz.getConstructors();

//      for (Constructor   c: cons) {
//        System.out.println("---"+c);
//      }

      Field field = clazz.getDeclaredField("age");
      field.set(obj, 90);
      System.out.println(field.get(obj));

      field = clazz.getDeclaredField("name");
      field.setAccessible(true);  //暴力访问... 私有化成员全部显现  没有任何隐私可言
      System.out.println(field.get(obj));

      //获取所有的字段属性


      //获取所有的方法
     Method me= clazz.getDeclaredMethod("show",String.class);
     //me.setAccessible(true);
     me.invoke(obj,"王二麻子");  //调用目标方法
      









    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }

    /**
     *
     * A:三种获取Class对象的方式
     * 1:Person p = new Person();
     *   Class c = p.getClass();
     *
     * 2:Class c2 = Person.class;
     *   任意数据类型都具备一个class静态属性,看上去要比第一种方式简单.
     *
     * 3:将类名作为字符串传递给Class类中的静态方法forName即可
     *   Class c3 = Class.forName("Person");
     *
     * 4:第三种和前两种的区别
     * 前两种你必须明确Person类型.
     * 后面是你我这种类型的字符串就行.这种扩展更强.我不需要知道你的类.我只提供字符串,按照配置文件加载就可以了
     */

  }

}
