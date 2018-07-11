package com.packageInterviewPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArraySortWithoutCollection {

	public static void main(String[] args) {

		ArraySortWithoutCollection as = new ArraySortWithoutCollection();
		as.method1();
		as.method2();
	}

	public void method1() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();

		arraylist.add(10010);
		arraylist.add(5);
		arraylist.add(4);
		arraylist.add(2);

		for (int i = 0; i < arraylist.size(); i++) {
			for (int j = 0; j < arraylist.size() - 1; j++) {
				if (arraylist.get(j) > arraylist.get(j + 1)) {

					int temp = arraylist.get(j);
					arraylist.set(j, arraylist.get(j + 1));
					arraylist.set(j + 1, temp);
				}
			}
		}

		for (int arr : arraylist) {
			System.out.println(arr);
		}

	}

	
	public void method2()
	{
		ArrayList<Integer> arraylist = new ArrayList<Integer>();

		arraylist.add(10010);
		arraylist.add(5);
		arraylist.add(4);
		arraylist.add(2);
		
		TreeSet<Integer> ts= new TreeSet<Integer>();
		
		ts.addAll(arraylist);
		
		for(int value:ts){							// we can use this to traverse
			System.out.println(value);
		}
		
		//or the below one 
		System.out.println(ts);
		
	}
}
