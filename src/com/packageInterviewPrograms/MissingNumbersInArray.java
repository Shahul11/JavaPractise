package com.packageInterviewPrograms;

public class MissingNumbersInArray {

	public static void main(String[] args) {

		int[] num = { 1, 2, 4, 5, 6 };
		int sum = 0;
		for (int i = 0; i <= num.length - 1; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);

		int num1 = 6;
		int sum1 = 0;
		for (int i = 0; i <= num1; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);

		System.out.println(sum1 - sum);
		MissingNumbersInArray ms = new MissingNumbersInArray();
		ms.formula(10); // for knowledge purpose
	}

	public void formula(int a) {
		int n = 0;
		n = a;
		int val = n * (n + 1) / 2;
		System.out.println(val);

	}

}