package com.packageInterviewPrograms;

public class StarPyramid {

	public static void main(String[] args) {
		int row = 5, spacecounter = 4, starCounter = 1;
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < spacecounter; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < starCounter; k++) {
				System.out.print("*");
			}
			spacecounter--;
			starCounter = starCounter + 2;
			System.out.println();
		}
		System.out.println("*******************************");
	
	}
}


// Anothe way
/*class anotherWay {

	public static void method1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/