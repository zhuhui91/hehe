package pretice03;

interface USB{
	void star();
	void stop();
}

class C{
	public static void work(USB u){
		u.star();
		System.out.println("工作中");
		u.stop();
	}
}

class USBisk implements USB{
	public void star(){
		System.out.println("U盘开始工作");
	}
    public void stop(){
    	System.out.println("U盘停止工作");
	}
}  

class Printer implements USB{
	public void star(){
		System.out.println("打印机开始工作");
	}
    public void stop(){
    	System.out.println("打印机停止工作");
	}
}

public class IterDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //因为只调用一次，可以使用匿名对象调用
		C.work(new USBisk());
		C.work(new Printer());
	}

}
