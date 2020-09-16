package com.flexon.javastringpractice;

public class Palindrome {

	public static boolean isPalindrome(String s) {
		String t = reverse(s);
		return s.equals(t);
	}
	
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// Test is input string is Palindrome
		if (args == null) {
			System.out.println("Please type in a word");
			return;
		}
		System.out.println("Reverse String is : " + reverse(args[0]));
		if (isPalindrome(args[0])) {
			System.out.println("Input String is Palindrome");
		} else {
			System.out.println("Input String is not Palindrome");
		}
	}

}
