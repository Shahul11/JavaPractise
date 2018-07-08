package com.packageInterviewPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		DuplicateElementsArray de = new DuplicateElementsArray();
		de.findDuplicates();
		de.findduplicates1();
	}

	// Method1
	public void findDuplicates() {
		String names[] = { "Java", "C", "C#", "Python", "Java", "Python" };
		System.out.println("Size:" + names.length);
		for (int i = 0; i <= names.length - 1; i++) {
			for (int j = i + 1; j <= names.length - 1; j++) {
				if (names[i].equals(names[j])) {
					System.out.println(names[j]);
				}
			}
		}
	}

	// Method2
	public void findduplicates1() {
		String names[] = { "Java", "C", "C#", "Python", "Java", "Python" };
		Set<String> store = new HashSet<String>();
		for (String name : names) {

			if (store.add(name) == false) {
				System.out.println(name);
			}
		}
	}

	// Method3

	public void findduplicates2()
	{
		String names[] = { "Java", "C", "C#", "Python", "Java", "Python" };
		Map<String, Integer> storemap= new HashMap<String, Integer>();
		for(String name:names)
		{
			
		}
		
		
	
	

}
}