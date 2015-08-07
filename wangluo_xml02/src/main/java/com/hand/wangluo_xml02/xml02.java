package com.hand.wangluo_xml02;


import java.io.File;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class xml02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder=factory.newDocumentBuilder();
	   Document document=builder.newDocument();
	   Element root=document.createElement("Languages");
	   root.setAttribute("cat", "it");
	   
	   Element lan1=document.createElement("lan");
	   lan1.setAttribute("id", "1");
	   Element name1=document.createElement("name");
	   name1.setTextContent("Java");
	   Element ide1=document.createElement("ide");
	   ide1.setTextContent("Eclipse");
	   lan1.appendChild(name1);
	   lan1.appendChild(ide1);
	   
	   Element lan2=document.createElement("lan");
	   lan2.setAttribute("id", "2");
	   Element name2=document.createElement("name");
	   name2.setTextContent("Swift");
	   Element ide2=document.createElement("ide");
	   ide2.setTextContent("XCode");
	   lan2.appendChild(name2);
	   lan2.appendChild(ide2);
	   
	   Element lan3=document.createElement("lan");
	   lan3.setAttribute("id", "3");
	   Element name3=document.createElement("name");
	   name3.setTextContent("C#");
	   Element ide3=document.createElement("ide");
	   ide1.setTextContent("Visual Studio");
	   lan3.appendChild(name3);
	   lan3.appendChild(ide3);
	   
	   root.appendChild(lan1);
	   root.appendChild(lan2);
	   root.appendChild(lan3);
	   document.appendChild(root);
	  
	   //------------------------------
	   
//	   System.out.println(document.toString());  //此输出为空,因为不是这样输出的
	   
	   TransformerFactory transformerFactory=TransformerFactory.newInstance();
	   Transformer transformer=transformerFactory.newTransformer();
	   StringWriter writer=new StringWriter();
	   transformer.transform(new DOMSource(document), new StreamResult(writer));
	   System.out.println(writer.toString());  //控制台输出
	   
	   transformer.transform(new DOMSource(document), new StreamResult(new File("newxml.xml")));
	   //生成新文件,在新文件选中内容:Ctrl+i 转换格式
     } catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (TransformerConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (TransformerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	}

}
