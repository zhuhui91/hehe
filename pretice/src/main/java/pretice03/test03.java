package pretice03;

class A1{
	public void tell1(){
		System.out.println("A1--tell1");
	}
	public void tell2(){
		System.out.println("A1--tell2");
	}
}

class B extends A1
{
	public void tell1(){
		System.out.println("B--tell1");
	}
	public void tell3(){
		System.out.println("B--tell3");
	}
}
public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //向上转型(多态性)
//		B b=new B();
//        A1 a=b;  
//        a.tell1();
//        a.tell2();
		//向下转型【只有发生向上转型才能发生向下转型】
		A1 a=new B();
	//A1 a=new A();  //这样是运行时发生“类型转换错误”-->
		B b=(B)a;
		b.tell1();
		b.tell2();
		b.tell3();
        
	}

}
