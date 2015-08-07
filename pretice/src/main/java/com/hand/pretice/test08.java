package com.hand.pretice;

public class test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   tell(10,20);
   tell(10,20,30);
	}
	
	public static void tell(int i,int j){
		System.out.println(i+j);
	}
   //方法重载
	public static void tell(int i,int j,int k){
		System.out.println(i+j+k);
	}
}
