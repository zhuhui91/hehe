package com.hand.pretice02;

import java.util.HashMap;
import java.util.Map;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<String,String> map=new HashMap<String,String>();
    map.put("key1", "jike");  //map通过map.put添加数据
    map.put("key2", "www"); 
    map.put("key3", "com"); 
    map.put("key4", "eoe"); 
    map.put("key5", "eoeandroid"); 
    map.put("key6", "hello"); 
//    String str=map.get("key1");
//    System.out.println(str);
    if(map.containsKey("key1")){
    	System.out.println("key存在");
    }else{
    	System.out.println("key不存在");
    }
    if(map.containsValue("jike")){
    	System.out.println("value存在");
    }else{
    	System.out.println("value不存在");
    }
    
	}

}
