package com.hand.pretice;


class Person2{
	private String name=null;
	private int age=0;
//	public int getAge(){
//		return age;
//	}
////	public void setAge(int age){
////		if(age>=0&&age<150){
////			this.age=age;
////		}
////		
////	}
//	public void setAge(int a){
//		if(a>=0&&a<150){
//			age=a;
//		}
//		
//	}
//	public String getName(){
//		return name;
//	}
//	public void setName(String name){
//		this.name=name;
//	}
	
	public void tell(){
		//get是得到
		System.out.println("姓名: "+getName()+"  "+"年龄: "+getAge());
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
}

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Person2 per=new Person2();  //声明并实例化
//		per.name="张";
//		per.age=10;
	    per.setAge(-30);  //设置年龄
	    per.setName("张三");
		per.tell();
	}

}
