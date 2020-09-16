package com.flexon.javastringpractice;

import java.util.Arrays;

public class Vowels {
	public static int countVowels(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) {
				res++;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println("Original input: " + Arrays.toString(args));
		int cnt = 0;
		for (int i = 0; i < args.length; i++) {
			cnt += countVowels(args[i]);
		}
		System.out.println("There are " + cnt + " vowels");
	}
}
