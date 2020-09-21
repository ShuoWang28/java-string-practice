package com.flexon.javastringpractice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {
	@Test
	public void PalindromeTest1() {
		System.out.println("This is the first Palindrome junit test");
		String input = "Apple";
		assertFalse(Palindrome.isPalindrome(input));
		System.out.println("First Palindrome test passed");
	}
	
	@Test
	public void VowelsTest2() {
		System.out.println("This is the second Palindrome junit test");
		String input = "appppa";
		assertTrue(Palindrome.isPalindrome(input));
		System.out.println("Second Palindrome test passed");
	}
}
