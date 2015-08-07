package JavaXML;

import java.io.File;
import java.io.IOException;
import java.security.DomainCombiner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xml01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	   try { 
		   
		      //DOM方式(Java中的经典)
		      DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		      DocumentBuilder builder=factory.newDocumentBuilder();
		      Document document=builder.parse(new File("languages.xml"));
		      Element root=document.getDocumentElement();
		      System.out.println("cat="+root.getAttribute("cat"));
		      NodeList list=root.getElementsByTagName("lan");
		      for(int i=0;i<list.getLength();i++){
		    	  Element lan=(Element) list.item(i);
		    	  System.out.println("-----------------");
		    	  System.out.println("id="+lan.getAttribute("id"));
		    	  
//		    	  Element name=(Element) lan.getElementsByTagName("name").item(0);
//		    	  System.out.println("name="+name.getTextContent());
		     
		    	  NodeList clist=lan.getChildNodes();
		    	  for(int j=0;j<clist.getLength();j++){
		    		  Node c=clist.item(j);
		    		  if(c instanceof Element){  //判断如果为element对象，则输出。[避免输出不可见的节点,例如:"回车"-->"#text="]
		    			  System.out.println(c.getNodeName()+"="+c.getTextContent());
		    		  }
		    		  
		    	  }
		      
		      }
		      
	} catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SAXException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
