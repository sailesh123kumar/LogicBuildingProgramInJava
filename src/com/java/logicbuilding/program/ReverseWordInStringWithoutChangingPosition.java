package com.java.logicbuilding.program;

import java.util.Arrays;

public class ReverseWordInStringWithoutChangingPosition {

	public static void main(String[] args) {
		String input = "Automation testing is fun";
		String result = reverseCharacter(input);
		System.out.println(result);
	}

	private static String reverseCharacter(String input) {

		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();
		StringBuilder reversedWord;

		for (String word : words) {
			reversedWord = new StringBuilder(word);
			result.append(reversedWord.reverse()).append(" ");
		}
		return result.toString().trim();

	}

}
