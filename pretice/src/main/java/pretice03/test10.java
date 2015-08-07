package pretice03;

import java.util.Set;
import java.util.TreeSet;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<String> s=null;  //声明
     s=new TreeSet<String>();//实例化
      s.add("B"); //添加
      s.add("A");
      s.add("C");
      s.add("S"); //添加
      s.add("F");
      s.add("E");
      System.out.println(s);
	}

}
