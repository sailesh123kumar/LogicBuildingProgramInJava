package com.java.logicbuilding.program;

public class CountCharactersWhenNoTrialingAndEndingSpace {

	public static void main(String[] args) {

		String input = " Hiedy ";

		countOfCharOnNoTrialingAndEndingSpace(input);

	}

	private static int countOfCharOnNoTrialingAndEndingSpace(String input) {

		int count = 0;
		char[] charArray = input.toCharArray();
		boolean isSpacePresentBeforeCurrentChar;
		boolean isSpacePresentAfterCurrentChar;

		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i]==' ') {
				continue;
			}

			isSpacePresentBeforeCurrentChar = i > 0 && charArray[i - 1] == ' ';
			isSpacePresentAfterCurrentChar = i < charArray.length - 1 && charArray[i + 1] == ' ';

			if (!isSpacePresentBeforeCurrentChar && !isSpacePresentAfterCurrentChar) {
				count++;
			}

		}
		System.out.println(count);
		return count;

	}

}
