package com.hand.pretice02;


class Father{
	private int age;
	private String name;
	
	public Father(){
		System.out.println("父类的构造方法");
	}
}

class Son extends Father{
	public Son(){
		System.out.println("子类的构造方法");
		
	}
	
}

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();

	}

}
