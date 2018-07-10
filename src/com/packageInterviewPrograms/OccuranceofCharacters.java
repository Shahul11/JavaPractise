package com.packageInterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceofCharacters {

	public static void main(String[] args) {

		String s1 = "Hello world";
		char[] strArray = s1.toCharArray();
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		for (char c : strArray) {
			if (hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);

			} else {
				hs.put(c, 1);
			}
		}

		System.out.println(hs);

		Set<Entry<Character, Integer>> entries = hs.entrySet();

		for (Map.Entry<Character, Integer> entry : entries) {
			Character key= entry.getKey();
			Integer value= entry.getValue();
			
			System.out.print(key);
			System.out.println(value);

		}

	}
}
