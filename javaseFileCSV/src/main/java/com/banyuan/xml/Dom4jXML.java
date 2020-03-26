package com.banyuan.xml;

import java.io.File;
import java.util.Iterator;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 10:47 上午
 */
public class Dom4jXML {

  public static void main(String[] args) throws DocumentException {
    //第一步：创建一个SAXReader解析器
    SAXReader reader = new SAXReader();
    //第二步：解析xml文件，重新构建成一个Document对象
    File file = new File("person.xml");
    Document doc = reader.read(file);

    //第三步：处理Document对象信息，在控制台打印
    Element element = doc.getRootElement();
    Iterator<Element> it = element.elementIterator();
    while (it.hasNext()) {
      Element e = it.next();
      //System.out.println("---"+e.attribute("id").getValue());
      // System.out.println(e.attributeValue("id"));
      Iterator<Element> elementIterator = e.elementIterator();

      while (elementIterator.hasNext()) {
        Element element1 = elementIterator.next();
        String str = (String) element1.getData();
        System.out.println(element1.getName() + "----" + element1.getTextTrim());
      }
    }
  }
}
