package com.java.logicbuilding.program;

public class ReverseonlyLetters {

	public static void main(String[] args) {

		String input = "1abcd2";

		String result = reverseonlyLetters(input);
		System.out.println(result);

	}

	private static String reverseonlyLetters(String input) {

		char[] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		

		while (left < right) {

			if (!Character.isAlphabetic(charArray[left])) {
				left++;
			} else if (!Character.isAlphabetic(charArray[right])) {
				right--;
			} else {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;

			}

		}

		return new String(charArray);
	}

}
