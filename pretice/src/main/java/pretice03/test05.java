package pretice03;

class A3{
	public void tell1(){
		System.out.println("A3--tell1");
	}
	public void tell2(){
		System.out.println("A3--tell2");
	}
}

class B3 extends A3
{
	public void tell1(){
		System.out.println("B3--tell1");
	}
	public void tell3(){
		System.out.println("B3--tell3");
	}
}

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           A3 a=new A3();
           System.out.println(a instanceof A3);
           System.out.println(a instanceof B3);
           A3 a1=new B3(); //向上转型
           System.out.println(a1 instanceof A3);
           System.out.println(a1 instanceof B3);
	}

}
