package com.packageInterviewPrograms;

import java.util.ArrayList;

public class JunkCharactersRemove {

	public static void main(String[] args) {
		String junkchar = "@#$%12345abxert";

		char[] c = junkchar.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i <= c.length - 1; i++) {

			if (c[i] != '@' && c[i] != '#') {
				sb.append(c[i]);
			}
		}

		System.out.println(sb);

		System.out.println("________________");

		JunkCharactersRemove jc = new JunkCharactersRemove();
		jc.junk();

	}

	public void junk() {
		String junkchar = "@#$%12345abxert";
		char[] c = junkchar.toCharArray();
		ArrayList al = new ArrayList();
		for (int i = 0; i < c.length; i++) {
			al.add(c[i]);
		}
		
		if(!al.contains("@"))
		System.out.println(al);
	}

}
