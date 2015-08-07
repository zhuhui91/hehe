package pretice03;

import java.util.Scanner;
import java.lang.String;

public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String gg="2015-01-01";
//		    System.out.println(gg);
		   String chai[]=gg.split("-");
//		    String chai[]=new String[10];
//		    chai=gg.split("-");
		    int t=gg.length();
//		    System.out.println("/n-"+t);
		    
		    char cut[]=gg.toCharArray();
		    int number = cut[5]-48;
		   // System.out.println(number);
		    int i1=Integer.parseInt(chai[0]);
		    int i2=Integer.parseInt(chai[1]);
		    int i3=Integer.parseInt(chai[2]);
		    System.out.println("i1:"+i1+" i2:"+i2+" i3:"+i3);
		  int dt=Integer.parseInt("23");
		  //  System.out.println(dt+1);
//		    System.out.println("cut[0]"+cut[9]);
		//    for(int i=0;i<chai.length;i++)
		   // 	System.out.println(chai[i]);
		  Scanner input=new Scanner(System.in);
		    System.out.println("请输入日期:");
		    //String gz=input.next();
		    //int cz=input.nextInt();
		    float fz=input.nextFloat();
		    System.out.println(fz);
		    
		   
	}

}
