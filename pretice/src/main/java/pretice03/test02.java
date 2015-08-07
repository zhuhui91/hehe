package pretice03;

abstract class Abs{
	private int age;
	public void tell(){
		
	}
	//抽象方法
	public abstract void say();
	public abstract void print();
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class AbsDemo extends Abs{
	public  void say(){
		System.out.println(getAge());
	}
	public void print(){
		
		
	}
}
public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //   Abs a=new Abs();
		 AbsDemo a=new AbsDemo();
		 a.setAge(20);
		 a.say();
		 a.print();
		 
		 
		 
	}

}
