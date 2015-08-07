package com.hand.pretice02;

import java.util.ArrayList;
import java.util.List;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //list集合
		List<String> lists=null;
		lists=new ArrayList<String>();
		lists.add("A");
		lists.add("B");
		lists.add("A");
		//list集合输出
		for(int i=0;i<lists.size();i++){
			System.out.println(lists.get(i));
		}
		lists.remove(0); // 移除第一项
		System.out.println("删除第一项后:");
		for(int i=0;i<lists.size();i++){
			System.out.println(lists.get(i));
		  }
		System.out.println("集合是否为空:"+lists.isEmpty());
		System.out.println("B是否存在:"+lists.indexOf("B"));
		System.out.println("B是否存在:"+lists.indexOf("C"));
		System.out.println("B是否存在:"+lists.indexOf("A"));
	}
}
