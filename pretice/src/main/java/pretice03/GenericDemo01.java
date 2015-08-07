package pretice03;

/*
 * 经纬度
 * int
 * float
 * String
 */
class Point<T>{
//	private Object x;
//	private Object y;
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
}

public class GenericDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Point<String> p=new Point<String>();
//      p.setX("经度为:109");
//      p.setY("纬度为:100");
      Point<Integer> p=new Point<Integer>();
      p.setX(109);
      p.setY(100);
      System.out.println(p.getX()+"  "+p.getY() );
	}

}
