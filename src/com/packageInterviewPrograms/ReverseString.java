package com.packageInterviewPrograms;

public class ReverseString {

	public static void main(String[] args) {

		ReverseString rs = new ReverseString();

		rs.Method1(); // Converting it has array and the traversing
		rs.method2(); // Reversing the Sentence
		rs.method3(); // Without converting it has array i.e using charAt()
		rs.metho4();  // Using String Buffer

	}

	public void Method1() {
		String s1 = "Hello World";
		char[] news1 = s1.toCharArray();
		String Rev = "";
		for (int i = news1.length - 1; i >= 0; i--) {
			Rev = Rev + news1[i];
		}
		System.out.println(Rev);
	}

	public void method2() {
		String s1 = "Hello World";
		String[] news1 = s1.split(" ");
		String rev = "";
		for (int i = news1.length - 1; i >= 0; i--) {
			rev = rev + " " + news1[i];
		}
		System.out.println(rev);
	}

	public void method3() {
		String s1 = "Hello World";
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
	}
	
	public void metho4(){
		String s1 = "Hello World";		
		StringBuffer sb= new StringBuffer(s1);
		System.out.println(sb.reverse());
	}
	

}
