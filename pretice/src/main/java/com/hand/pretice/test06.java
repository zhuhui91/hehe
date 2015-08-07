package com.hand.pretice;
import java.util.Scanner;
public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner scannner=new Scanner(System.in); //创建Scanner类的对象
//System.out.println("接收控制台输入数据(例如:姓名):");
//String name=scannner.next();
//System.out.println("接收的是:"+name);
		//步骤1、创建Scanner对象
		Scanner scanner=new Scanner(System.in);
		//步骤2、向控制台输入文本
		System.out.println("姓名:");
		//步骤3:接收输入的姓名字符串
		String name=scanner.next();
		System.out.println("性别:");
		char sex=scanner.next().charAt(0);
		System.out.println("年龄:");
		int age=scanner.nextInt();
		System.out.println("身高:");
		double height=scanner.nextDouble();
		System.out.println("性格:");
		String type=scanner.next();
		System.out.println("姓名:"+name+",性别:"+sex+",年龄:"+age+",身高:"+
		",性格:"+type);
		

	}

}
