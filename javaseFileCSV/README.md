```text
尽管HTML和XML同宗同源，但是两者之间存在着重要的区别:
与HTML不同，XML是大小写敏感的。例如，<H1>和<h1>是不同的XML标签。
在HTML中，如果从上下文中可以分清哪里是段落或列表项的结尾，那么结朿标签(如</p>或</1i>)就可以省略，而在XML中结束标签绝对不能省略。
在XML中，只有单个标签而没有相对应的结束标签的元素必须以/结尾，比如<img src="coffeecup.png"/>。这样，解析器就知道不芯要查找</img>标签了。
在XML中，属性值必须用引号括起来。在HTML中，引号是可有可无的。例如,<applet code="MyApplet.class" width=300 height=300>对HTML来说是合法的，但是对XML来说则是不合法的。在XML中，必须使用引号，比如，width="300"。
在HTML中，属性名可以没有值。例如，<input type=Mradio" name="language" value="Java"checked>。
在XML中，所有属性必须都有属性值。比如，"true"或checked="checked"。
```