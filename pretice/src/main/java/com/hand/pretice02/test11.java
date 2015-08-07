package com.hand.pretice02;

class People1{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

class Worker extends People1{
	public void tell(){
		System.out.println(getAge());
	}
}

class PetWorker extends Worker{
	
}

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w=new Worker();
		w.tell();
		w.setAge(100);
		w.tell();

	}

}
