package com.hand.pretice;


class Student{
	public void tell(){
		System.out.println("hello,niming!");
	}
}

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         Student stu=new Student();
//         stu.tell();
         //匿名对象
         new Student().tell();
	}

}
