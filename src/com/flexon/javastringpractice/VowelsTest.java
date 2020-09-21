package com.flexon.javastringpractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VowelsTest {
	
	@Test
	public void VowelTest1() {
		System.out.println("This is the first Vowel junit test");
		String input = "This is first test";
		assertEquals(4, Vowels.countVowels(input));
		System.out.println("First Vowels test passed");
	}
	
	@Test
	public void VowelsTest2() {
		System.out.println("This is the second Vowel junit test");
		String input = "This is second test";
		assertEquals(5, Vowels.countVowels(input));
		System.out.println("Second Vowels test passed");
	}
}
