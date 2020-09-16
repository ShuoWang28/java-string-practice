package com.flexon.javastringpractice;

public class LastLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("Please type in something");
			return;
		}
		String s = args[0];
		for (int i = 1; i < args.length; i++) {
			s += " ";
			s += args[i];
		}
		System.out.println("There are " + 
		        countWordEndwithS(args) + " words ends with s");
		System.out.println("There are " + 
		        countWordEndWithY(args) + " words ends with y");
		System.out.println("Old string is: " + s);
		System.out.println("New string is: " + replaceFirstInstance(s));
	}
	
	public static String replaceFirstInstance(String s) {
		String[] arr = s.split(" ");
		int index_s = -1, index_y = -1;
		for (int i = 0; i < arr.length; i++) {
			if (endsWithS(arr[i]) && index_s == -1) {
				index_s = i;
			}
			if (endsWithY(arr[i]) && index_y == -1) {
				index_y = i;
			}
		}
		String temp = arr[index_s];
		arr[index_s] = arr[index_y];
		arr[index_y] = temp;
		String res = "";
		for (String t : arr) {
			res += t;
			res += " ";
		}
		return res;
	}
	
	public static int countWordEndwithS (String[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (endsWithS(arr[i])) cnt++;
		}
		return cnt;
	}
	
	public static int countWordEndWithY (String[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (endsWithY(arr[i])) cnt++;
		}
		return cnt;
	}
	
	public static boolean endsWithS (String s) {
		return s.charAt(s.length() - 1) == 's' ||
			   s.charAt(s.length() - 1) == 'S';
	}

	public static boolean endsWithY (String s) {
		return s.charAt(s.length() - 1) == 'y' ||
			   s.charAt(s.length() - 1) == 'Y';
	}
}
