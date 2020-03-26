package com.banyuan.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/26 11:04 上午
 */
public class UseDom4jWriteDataToXML {

  public static void main(String[] args) throws IOException {
    //第一步：创建一个Document实例

    Document doc = DocumentHelper.createDocument();

   // 第二步：先添加一个根结点，然后再添加子结点，构造成一个树形结构
    Element root = doc.addElement("root");
    //添加xml内容
    Element   oneElement=root.addElement("student").addAttribute("id", "9527");
    oneElement.addElement("name").addAttribute("attr", "baba").addText("大保健");
    oneElement.addElement("age").addText("24");
    oneElement.addElement("address").addAttribute("id", "address").addText("秦淮区...");

    Element   twoElement=root.addElement("student").addAttribute("id", "9528");
    twoElement.addElement("name").addAttribute("attr", "mama").addText("大砍刀");
    twoElement.addElement("age").addText("25");
    twoElement.addElement("address").addAttribute("id", "address").addText("微信32区...");


    //第三步：添加xml文件样式（也可自定义样式），并输出xml文件到指定的路径下
    //OutputFormat format = OutputFormat.createPrettyPrint(); xml默认格式

    OutputFormat format = new OutputFormat(); //自定义格式
    format.setIndentSize(2);  // 行缩进
    format.setNewlines(true); // 一个结点为一行
    format.setTrimText(true); // 去重空格
    format.setPadText(true);
    format.setNewLineAfterDeclaration(false); // 放置xml文件中第二行为空白

    File  file=new File("Student.xml");
    if(!file.exists()){
        file.createNewFile();
    }
    XMLWriter writer = new XMLWriter(new FileOutputStream(file), format);
    writer.write(doc);
    writer.close();

    //



  }


}
