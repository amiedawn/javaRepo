package com.training.mars;

import java.util.Arrays;

public class Anagram2 {

	public static boolean Anagram(String str1, String str2) {
		
		if (str1 == null || str2 == null) {
			return false;
		}

		if (str1.length() != str2.length()) {
			return false;
		}
		
		// remove all non-alphanumeric characters (punctuation, spaces, and symbols
		String strA = str1.replaceAll("[\\s^a-zA-Z0-9\\s]", " ");
		String strB = str2.replaceAll("[\\s^a-zA-Z0-9\\s]", " ");

		
		char c1[] = strA.toLowerCase().toCharArray();
		char c2[] = strB.toLowerCase().toCharArray();
			
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1,  c2);
		}



	public static void main(String[] args) {
		System.out.println("The following should be true: ");
		System.out.println(Anagram("arc", "car"));
		System.out.println(Anagram("el bow", " below"));
		System.out.println(Anagram("State", "tAstE"));
		System.out.println(Anagram("do rmi!tor?y", "di?rty Room!"));
		System.out.println(Anagram("debit card", "badcredi t"));
		System.out.println("The following should be false: ");
		System.out.println(Anagram(" ", "book"));
		System.out.println(Anagram("the ", "thee "));
		
	}
}