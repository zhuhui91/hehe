package com.hand.pretice02;

class A{
	public void tell(){
		System.out.println("我是tell方法");
	}
}
class B extends A{
	public void tell(){
		 super.tell();//子类通过super关键字调用父类方法
		System.out.println("我重写了tell方法");
	}
}

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b=new B();
        b.tell();
	}

}
