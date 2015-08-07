package pretice03;

class A2{
	public void tell1(){
		System.out.println("A2---tell1");
	}
}

class B2 extends A2{
	public void tell2(){
		System.out.println("B2---tell2");
	}
}

class C2 extends A2{
	public void tell3(){
		System.out.println("C2---tell3");
	}
}

class D2 extends A2{
	
}

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      say(new B2());
      say(new C2());
      say(new D2());
		
	}
	
	public static void say(A2 a){
		a.tell1();
	}

}
