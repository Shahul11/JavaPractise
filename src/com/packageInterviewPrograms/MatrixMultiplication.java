package com.packageInterviewPrograms;

public class MatrixMultiplication {

	public static void main(String[] args) {

		// Note i= Depends on the number of rows of the first matrix
		// J depends on the number of columns present in the second matrix
		// K depends on the number of columns of first matrix or number of rows
		// present in the second matrix

		// 2x3 3x3 result matrix will be 2x3
		int m1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int m2[][] = { { 7, 8, 1 }, { 9, 10, 1 }, { 11, 12, 6 } };

		//// 1x2 2x3 result matrix will be  1x3
		//int m1[][] = { { 1, 2 } };
		//int m2[][] = { { 7, 8, 1 }, { 9, 10, 1 } };
		
		

		int sum = 0;
		int r[][] = new int[3][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {

				for (int k = 0; k < 3; k++) {
					sum = sum + m1[i][k] * m2[k][j];
					// sum = sum + m1[i][k] * m2[j][k]; //wrong
				}
				r[i][j] = sum;
				sum = 0;
			}
		}

		// This one derive it from the result matrix

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(r[i][j] + " ");
			}

			System.out.println();
		}

	}

}
