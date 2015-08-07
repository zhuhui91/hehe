package pretice03;

import java.util.List;
import java.util.ArrayList;

public class test08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> lists=null;  //声明
     lists=new ArrayList<String>(); //实例化
     lists.add("A"); //通过add添加数据
     lists.add("B");
     lists.add("A"); //List可以重复
     for(int i=0;i<lists.size();i++){  //List接口中,size()返回列表中的元素数
    	 System.out.println(lists.get(i));  //get()获取
     }
     lists.remove(0); //remove()方法移除集合中的某个元素
     System.out.println("删除后----");
     for(int i=0;i<lists.size();i++){  
    	 System.out.println(lists.get(i));  
     }
     System.out.println("集合是否为空:"+lists.isEmpty()); //判断集合是否为空,不为空返回false
	 System.out.println("B是否为空:"+lists.indexOf("B"));
	     //indexOf()方法,若存在则输出下标号,否则(即不存在)返回-1
	}

}
