package com.java.logicbuilding.program;

import java.util.Arrays;

public class ReverseWordInStringWithoutChangingPositionSolutionTwo {

	public static void main(String[] args) {
		String input = "Automation testing is fun";
		String result = reverseCharacter(input);
		System.out.println(result);
	}

	private static String reverseCharacter(String input) {

		String[] words = input.split(" ");
		String result = "";
		for (String word : words) {
			result = result + reverseWord(word) + " ";
		}

		return result.trim();

	}

	private static String reverseWord(String word) {
		char[] charArray = word.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;

		}

		return new String(charArray);

	}

}
