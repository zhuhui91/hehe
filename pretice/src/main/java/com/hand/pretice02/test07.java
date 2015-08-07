package com.hand.pretice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lists=null;
		lists=new Vector<String>();
		lists.add("A");
		lists.add("B");
		//vector集合输出
		for(int i=0;i<lists.size();i++){
			System.out.println(lists.get(i));
		}
	}

}
