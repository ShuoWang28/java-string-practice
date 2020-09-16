package com.flexon.javastringpractice;

import java.util.Arrays;

public class Word {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please type in something");
			return;
		}
		String s = "";
		for (String t: args) {
			s += t;
			s += " ";
		}
		System.out.println("Input is: " + Arrays.toString(args));
		System.out.println("There are " + countWord(s) + " words in the sentence.");
	}
	
	public static int countWord(String s) {
		String[] arr = s.split(" ");
		return arr.length;
	}

}
