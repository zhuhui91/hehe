package com.hand.pretice;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(addNum(100));
          
	}
	/*递归:方法自己调用自己
	 * 从1+100; 100+99+98+....+1
	 */
     public static int addNum(int num){
    	 if(num==1){  //程序出口
    		 return 1;
    	 }else{
    		  return num+addNum(num-1);
    	 }
     }
}
