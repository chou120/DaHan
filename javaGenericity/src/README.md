```text
在定义泛型类的时候使用类型参数（type parameters）的方式进行定义，
一个类可以带有一个或多个的类型参数，每个参数代表一个类型，可以把类型参数理解为数据类型的占位符，
同一个类型参数代表了同一种数据类型
语法
在类名后面使用<> 括起来一个类型参数名即可。多个类型参数可以分隔开。
类型参数名称通常是大写，字符不易过多。java预制的泛型类中通常使用E表示集合元素的数据类型,
K表示Key的数据类型，V表示value的数据类型，T表示任意类型。定义好泛型类之后，
可以该类内部可以把类型参数当做数据类型使用。

List<T> , 这个 T 是一个形参，可以理解为一个占位符，被使用时，会在程序运行的时候替换成具体的类型，比如替换成String，Integer之类的。

List<?>, 这个 ？ 是一个实参，这是Java定义的一种特殊类型，比Object更特殊，就像一个影子。
比如List<Object>和List<String>是没有父子关系的，这是两个类型，List<Object>类型和List<String>类型；
但是List<?> 是 List<String>的父类。

用数学集合的语言来表述，? 表示了集合【所有Java类型，String，Integer等系统定义的，或者用户定义的Foo等类型】这个整体；而 T 表示了集合【所有Java类型，String，Integer等系统定义的，或者用户定义的Foo等类型】中的一个成员。


```