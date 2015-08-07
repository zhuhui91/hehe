package pretice03;
   //接口简单例子
interface Inter1{
	public static final int AGE=100;  //全局常量，不可更改
	public abstract void tell();
}

interface Inter2{
	public abstract void say();
}

abstract class Abs1{
	public abstract void print();
}

class A extends Abs1 implements Inter1,Inter2{
	public  void tell(){
		
	}
public  void say(){
		
	}
public  void print(){
	
}
}

interface Inter3 extends Inter1,Inter2{
	
}

public class interDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Inter i=new Inter();
		A a=new A();
		a.tell();
		System.out.println(a.AGE);
		a.say();
		a.print();
	}

}
