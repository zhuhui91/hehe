package com.hand.pretice02;

import org.omg.Messaging.SyncScopeHelper;

class Ref2{
	String temp="hheeh";
}

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("未成功引用");
         String str1="hello";
         System.out.println("str1--->"+str1);
         tell(str1);
         System.out.println("str2--->str1:"+str1);
         System.out.println("---------成功引用----------");
         Ref2 r1=new Ref2();
         System.out.println("temp: "+r1.temp);
         r1.temp="success";
         System.out.println("----->temp: "+r1.temp);
         tell2(r1);
         System.out.println("-->temp-->"+r1.temp);
         
         
	}
	public static void tell(String str2){
		str2="hand";
	}
	public static void tell2(Ref2 r2){
		r2.temp="failure";
	}

}
