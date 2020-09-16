package com.flexon.javastringpractice;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Test function countVowels
		testVowels(args);
		
	}
	
	public static void testVowels(String[] s) {
		System.out.println("Original input: " + Arrays.toString(s));
		int cnt = 0;
		for (int i = 0; i < s.length; i++) {
			cnt += Vowels.countVowels(s[i]);
		}
		System.out.println("There are " + cnt + " vowels");
	}
}
