package com.flexon.javastringpractice;

import java.util.Arrays;

public class Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("Please type in something");
			return;
		}
		System.out.println("Input is: " + Arrays.toString(args));
		System.out.println("There are " + countConsonant(args[0]) + " consonants");
		System.out.println("The new string is: " + replaceConsonants(args[0]));
	}
	
	public static String replaceConsonants(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ("AEIOUaeiou".indexOf(c) != -1) {
				sb.append(c);
			} else {
				sb.append('*');
			}
		}
		return sb.toString();
	}
	
	public static int countConsonant(String s) {
		return s.length() - Vowels.countVowels(s);
	}
}
