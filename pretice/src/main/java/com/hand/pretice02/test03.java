package com.hand.pretice02;

class People02{
	public void tell(){
		System.out.println(this);
	}
}

class People{
	private String name;
	private int age;
	
	public People(String name,int age){
		this();//在有参数的构造方法中，调用无参数的构造方法（注意：程序中，无参数构造方法应该有输出提示）
		this.name=name;
		//this(); //应放在第一行S
		this.age=age;
		
	}
	
	public People(){
		System.out.println("无参数构造方法");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void tell(){
		System.out.println("姓名: "+this.getName()+"  "+"年龄: "+this.getAge());
	}
}

public class test03 {
        //java this关键字
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     People  p=new People("掌声",30);
//     p.tell();
		People02 p2=new People02();
		System.out.println(p2);
		p2.tell();
		
	}

}
