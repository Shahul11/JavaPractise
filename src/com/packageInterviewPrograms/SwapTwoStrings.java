package com.packageInterviewPrograms;

public class SwapTwoStrings {

	public static void main(String[] args) {

		String s1 = "Hello";  // Size 5
		String s2 = "World";  // Sixze 5

		s1 = s1 + s2;  // 10
		
		s2=s1.substring(0,s1.length()-s2.length()); //(0,10-5)
		System.out.println(s2);
		
		s1=s1.substring(s2.length()); // Note stars from the 5th character to till end
		//i.e HelloWorld   it will start from  5th index as begnning index reaches till the end
		System.out.println(s1);
		

	}

}
