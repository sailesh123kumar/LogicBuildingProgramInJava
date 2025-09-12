package com.java.logicbuilding.program;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		
		String input1 = "listen";
		String input2 = "silent";
		
		boolean result = isAnagram(input1,input2);
		System.out.println(result);
	}

	private static boolean isAnagram(String input1, String input2) {

		if(input1.length() != input2.length()) {
			return false;
		}
		
		char[] inputArr1 = input1.toLowerCase().toCharArray();
		char[] inputArr2 = input2.toLowerCase().toCharArray();
		
	
		Arrays.sort(inputArr1);
		Arrays.sort(inputArr2);
		
		return Arrays.equals(inputArr1, inputArr2);
		
	}

}
