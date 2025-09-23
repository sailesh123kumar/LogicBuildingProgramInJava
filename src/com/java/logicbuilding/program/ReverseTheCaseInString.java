package com.java.logicbuilding.program;

public class ReverseTheCaseInString {

	public static void main(String[] args) {

		String input = "Hello World";

		String output = reverseCase(input);
		System.out.println(output);

	}

	private static String reverseCase(String input) {

		char[] charArray = input.toCharArray();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < charArray.length; i++) {

			if (Character.isUpperCase(charArray[i])) {
				result.append(Character.toLowerCase(charArray[i]));
			} else if (Character.isLowerCase(charArray[i])) {
				result.append(Character.toUpperCase(charArray[i]));
			} else {
				result.append(charArray[i]);
			}
		}
		return result.toString().trim();
	}

}
