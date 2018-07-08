package com.packageInterviewPrograms;

public class SmallestAndLargestNumbersArray {

	public static void main(String[] args) {
		int num[]={100,200,600,500,800,900,-250,-365,12568};
		
		int largest=num[0];
		int smallest=num[0];
		
		for (int i = 1; i < num.length; i++) {
			
			if(num[i]>largest)
			{
				largest=num[i];
			}
			else if(num[i]<smallest)
			{
				smallest=num[i];
			}
			
		}
		System.out.println("Largest number is: " +largest);
		System.out.println("Smalles number is: "+smallest);

	}

}
