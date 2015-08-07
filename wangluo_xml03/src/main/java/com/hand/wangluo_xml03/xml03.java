package com.hand.wangluo_xml03;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

public class xml03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String xmlString="<root><people>ACELY</people></root>";
      
      try {
    	  
		Document document=DocumentHelper.parseText(xmlString);
		
		System.out.println(document.asXML());
		
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
	}
      
}
