package com.training.mars;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Anagram {

	public static void main(String[] args) {
		// TODO: Decide if 2 strings are anagrams of each other
		// ignore white space and punctuation
		// examples: "parliament" is an anagram of "partial men"

		// declare 2 strings
//		String str1 = "parliament!";
//		String str2 = "partial!men";
		String str1 = "software";
		String str2 = "swearoft";

		// ignore white space and punctuation
		String result1 = str1.replaceAll("\\p{Punct}", "");
		String result2 = str2.replaceAll("\\p{Punct}", "");

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(isAnagram(result1, result2));
		System.out.println("These 2 strings are not anagrams of each other.");
	}

	public static int isAnagram(String result1, String result2) {
		int value = 0;
		System.out.println(result1.length());
		System.out.println(result2.length());
		
		if (result1.length() != result2.length()) {
			System.out.println("These 2 strings are not anagrams of each other.");

		} else if (result1.length() == result2.length()) {
			System.out.println("in right loop");
			for (int i = 0; i < result1.length(); i++) {
				int value1 = value + result1.charAt(i);
				int value2 = value - result2.charAt(i);
				System.out.println(value1);
				System.out.println(value2);
				if (value1 == -(value2)) {
					System.out.println("These 2 strings are anagrams of each other.");
					break;
				}
				
			}
		} else {
			value = -1;
			System.out.println("in wrong statement");
			System.out.println("These 2 strings are not anagrams of each other.");

		}
		return value;
	}
}