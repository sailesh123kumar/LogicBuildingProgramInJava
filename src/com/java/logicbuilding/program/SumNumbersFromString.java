package com.java.logicbuilding.program;

public class SumNumbersFromString {

	public static void main(String[] args) {

		String input = "This is 1000 and it should be 20 30 50 1050";

		sumOfNumberFromString(input);

	}

	private static void sumOfNumberFromString(String input) {

		String[] words = input.split(" ");
		int result = 0;

		for (String word : words) {
			try {
				result = result + Integer.parseInt(word);
			} catch (NumberFormatException e) {

			}
		}
		System.out.println(result);
	}

}
