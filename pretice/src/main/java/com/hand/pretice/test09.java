package com.hand.pretice;


class Person{
	String name=null;
	int age=0;
	public void tell(){
		System.out.println("姓名: "+name+"  "+"年龄: "+age);
	}
}

public class test09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 创建对像
		 * 赋值
		 * 对象.属性
		 * 对象.方法
		 */
		Person per=null;  //声明
//		per=new Person(); //实例化操作,使用new开辟堆内存空间
//		Person per=new Person();  //声明并实例化
		per.name="张";
		per.age=10;
		per.tell();
		/*
		 * 当只有声明，没有实例化操作时:
		 * Exception in thread "main" java.lang.NullPointerException
		 * 空指针异常
		 */
		
		
		
	}

}
