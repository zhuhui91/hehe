package com.hand.pretice;
import java.util.Scanner;
public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    int i=-2;
//    long l=i;
//    System.out.println(i+":"+Integer.toBinaryString(i));
//    System.out.println(i+":"+Long.toBinaryString(l));
    Scanner input=new Scanner(System.in);
    System.out.println("请输入内容:");
    int conntents=input.nextInt();
    conntents++;
    System.out.println("conntents++="+conntents);
    char c=65;
    int i='D';
    System.out.println(c+","+i);
    int j=c+1;
    c=(char)(c+1);
    System.out.println(c+","+j);
    
	}

}
