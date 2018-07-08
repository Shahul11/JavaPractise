package com.naveenautomationlabsPrograms;

public class CallbyValueCallbyReference {
	int p;
	int q;

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		CallbyValueCallbyReference cv = new CallbyValueCallbyReference();
		int result = cv.sum(a, b);
		System.out.println(result);

		cv.p = 100;
		cv.q = 200;

		System.out.println("Before Swapping\n");
		System.out.println("P value is:" + cv.p);
		System.out.println("q value is:" + cv.q);

		cv.swamp(cv);
		System.out.println("After Swapping\n");
		System.out.println("P value is:" + cv.p);
		System.out.println("q value is:" + cv.q);
	}

	public int sum(int x, int y) {
		System.out.println("Pass by value");
		return x + y;
	}

	public void swamp(CallbyValueCallbyReference rf) {
		int temp;
		temp = rf.p;
		rf.p = rf.q;
		rf.q = temp;
	}

}
