package pretice03;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String,String> map=new HashMap<String,String>();
     map.put("key1", "jike"); //put(K key, V value) ,将指定的值与此映射中的指定键关联（可选操作）。
     map.put("key2", "www");
     map.put("key3", "com");
     map.put("key4", "eoe");
     map.put("key5", "eoeandord");
     map.put("key6", "hello");
//    Set<String> s=map.keySet(); //感应所有的键【输出结果:key4
////    key3
////    key6
////    key5
////    key2
////    key1】
//    Iterator<String> i=s.iterator(); //迭代输出
//     while(i.hasNext()){
//    	 System.out.println(i.next());
//     }
     Collection<String> c=map.values();  //values() ,返回此映射中包含的值的 Collection 视图
     Iterator<String> i=c.iterator();
     while(i.hasNext()){
    	 System.out.println(i.next());
     }
     
	}

}
