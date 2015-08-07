package pretice03;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> lists=new ArrayList<String>();//实例化
		      lists.add("B"); //添加
		      lists.add("A");
		      lists.add("C");
		      lists.add("S"); //添加
		      lists.add("F");
		      lists.add("E");
		 Iterator<String> iter=lists.iterator(); //实例化Iterator
		 while(iter.hasNext()){  
//hasNext()方法,以正向遍历列表时，如果列表迭代器有多个元素，则返回 true（换句话说，
			 //如果 next 返回一个元素而不是抛出异常，则返回 true）。
			 String str=iter.next();  //next(),返回列表中的下一个元素
			 if("A".equals(str)){
				 iter.remove();
			 }else
			     System.out.println(str);
//			 lists.remove(2);  //迭代输出时,不能使用remove方法,否则运行出错!
//			 System.out.println(iter.next());
		 }
	}

}
