package com.hand.pretice02;

class Ref1{
	int temp=10;
}

public class test01 {
   //java引用传递
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         Ref1 r1=null; //创建对象
//         r1=new Ref1(); //实例化操作
		 Ref1 r1=new Ref1(); 
		 r1.temp=20;
		 System.out.println("the is: "+r1.temp);
		 tell(r1);
		 System.out.println("the is: "+r1.temp);
	}
   public static void tell(Ref1 r2){
	r2.temp=30;   
   }
}
