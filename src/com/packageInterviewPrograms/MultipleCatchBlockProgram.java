package com.packageInterviewPrograms;

public class MultipleCatchBlockProgram {

	public static void main(String[] args) {
		int num1 = 0;

		try {

			int result = 10 / num1;
			String s1 = null;
			System.out.println(s1.concat("Hello"));

			int[] arr = { 1, 2 };
			System.out.println(arr[3]);

		}

		catch (ArithmeticException e) {
			System.out.println(e);
		}

		catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			System.out.println("Exception Handled succesfully");
		}

	}

}
