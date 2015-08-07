package com.hand.pretice;


class People{
	//构造方法
	int age;
	String name;
	public People(int a,String n){
		System.out.println("hello,class!");
		age=a;
		name=n;
		System.out.println("年龄: "+age+"  "+"姓名: "+name);
	}
	
	public People(int a){
		age=a;
		System.out.println("年龄: "+age);
	}
}


public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       People per=new People(30,"招商");
       People per=new People(30);
	}

}
