package pretice03;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
int dt[]=new int[50];
//List<Integer> list = new ArrayList<Integer>();
Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for(i=0;i<50;i++){
	dt[i]=(int)(Math.random() * 90+10) ; 
}
	
	 //list=Array//赋值给list集合
List<Integer> lis = ArrayList(dt);
//for(int k=0;k<50;k++){
//	int yd=dt[k];
//	list.add(yd);
//}
		
	
	
	for(int j =0;j<lis.size();j++){  //list集合赋值给map集合
        map.put(i, lis.get(j));  
    }
	
	 Collection<Integer> c=map.values();  //values() ,返回此映射中包含的值的 Collection 视图
     Iterator<Integer> it=c.iterator();
     while(it.hasNext()){
    	 System.out.print(it.next());
     }
	System.out.println();
	}

	private static List<Integer> ArrayList(int[] dt) {
		// TODO Auto-generated method stub
		return null;
	}
}
