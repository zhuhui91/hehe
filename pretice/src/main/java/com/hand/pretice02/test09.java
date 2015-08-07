package com.hand.pretice02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> lists=new ArrayList<String>();
       lists.add("A");
       lists.add("B");
       lists.add("C");
       lists.add("D");
       lists.add("E");
       lists.add("F");
       Iterator<String> iter=lists.iterator();
       while(iter.hasNext()){
    	   String str=iter.next();
    	   if("A".equals(str)){
    		   iter.remove();  //注意:不要在迭代输出时删除集合元素，否则出错!
    	   }else{
    		   System.out.println(str);
    	   }
    	   
       }
	}

}
