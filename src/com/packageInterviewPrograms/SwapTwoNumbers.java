package com.packageInterviewPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x=10;
		int y=11;
		
		x=x+y;  //21
		y=x-y;	//21-11=10
		x=x-y;  //21-10=11
		
		System.out.println("Value of x is:"+ x);
		System.out.println("Value of y is:" + y);
		
	}

}
