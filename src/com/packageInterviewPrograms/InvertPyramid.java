package com.packageInterviewPrograms;

public class InvertPyramid {

	public static void main(String[] args) {
		int startcounter1=5;
		for (int i = 0; i <=5; i++) {
			for (int s = 0; s <= i; s++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= startcounter1; j++) {
				System.out.print("*");
			}
			startcounter1=startcounter1-2;
			System.out.println();
		}

	}

}
