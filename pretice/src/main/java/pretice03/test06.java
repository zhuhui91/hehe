package pretice03;

abstract class Person{
	private int age;
	private String name;
	public Person(int age,String name){
         this.age=age;
         this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void want();
    	
}

class Student1 extends Person{
    private int score;
    public int getScore() {
		return score;
	}
    public void setScore(int score) {
		this.score = score;
	}
	public Student1(int age, String name,int score) {
		super(age, name);
		this.score=score;
		
	}

	public void want() {
		System.out.println("姓名: "+getName()+" 年龄: "+getAge()+" 成绩: "+getScore());
	}
	
}

class Worker1 extends Person{
	private int money;
	
	public Worker1(int age,String name,int money){
		super(age,name);
		this.money=money;
	}
	

	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public void want() {
		// TODO Auto-generated method stub
		System.out.println("姓名: "+getName()+" 年龄: "+getAge()+" 工资: "+getMoney());
	}
}

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student1 s=new Student1(10, "大名", 100);
       s.want();
       Worker1 w=new Worker1(28, "大名", 12000);
       w.want();
	}

}
