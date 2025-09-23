package com.java.logicbuilding.program;

import java.util.Arrays;

public class ReverseFirstWord {

	public static void main(String[] args) {

		String input = "Dive into Automation Testing";

		reverseFirstWord(input);
	}

	private static void reverseFirstWord(String input) {

		String[] splittedString = input.split(" ", 2);
		
		StringBuilder result = new StringBuilder();
		String reversedFirstWord = reverse(splittedString);
		result.append(reversedFirstWord).append(" ").append(splittedString[splittedString.length-1]);
		System.out.println(result);

	}

	private static String reverse(String[] splittedString) {
		String firstIndex = splittedString[0];
		char[] charArray = firstIndex.toCharArray();
		
		int left = 0;
		int right = charArray.length-1;
		char temp ;
		while(left<right) {
			temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		
		return new String(charArray);
	}
}
