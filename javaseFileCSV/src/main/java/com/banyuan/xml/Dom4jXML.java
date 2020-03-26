package com.banyuan.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 9:12 上午
 */
public class Dom4jXML {

  public static void main(String[] args)
      throws ParserConfigurationException, IOException, SAXException {
    //
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();//获取生成文档解析器的工厂
    DocumentBuilder builder = factory.newDocumentBuilder(); //获取文档解析器

    Person  person =new  Person();

    File f =new  File("person.xml");
    Document doc = builder.parse(f);  //开始解析 xml文档

    Element root=doc.getDocumentElement();  //获取xml文档的根节点

    //System.out.println(root.getTagName()); //获取的是根目录的名称
    NodeList  nodeList=root.getChildNodes();

    for (int i = 0; i <nodeList.getLength(); i++) {

      Element  e=(Element) nodeList.item(1);
      //获取person 节点属性值
      System.out.println("=------======="+e.getAttribute("id"));
      NodeList  nodeList1=nodeList.item(i).getChildNodes(); //获取子节点的子节点
      for (int j = 0; j < nodeList1.getLength(); j++) {
        Node child=nodeList1.item(j);
        if (child instanceof Element) {  //判断子节点是否是一个元素  文本空白符不是元素
          Element childElement = (Element) child;
          System.out.println("----"+childElement.getAttribute("class"));
          Text  text=(Text)childElement.getFirstChild();
          String  str=text.getData().trim();
          if(childElement.getTagName().equals("name")){
            person.setName(str);
          }
          if(childElement.getTagName().equals("age")){
            person.setAge(Integer.valueOf(str));
          }
        }
      }
    }
    System.out.println("得到数据有:"+person.toString());

    //以上是dom格式的解析  w3c一个标准解析   并不是市场常用解析  市场常用的解析是Dom4j解析



  }

}
