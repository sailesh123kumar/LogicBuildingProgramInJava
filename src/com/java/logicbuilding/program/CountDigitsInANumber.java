package com.java.logicbuilding.program;

public class CountDigitsInANumber {

	public static void main(String[] args) {

		int input = 45678;

		countDigit(input);

	}

	private static void countDigit(int input) {

		int digitCount = 0;

		while (input != 0) {
			input = input / 10;
			digitCount++;
		}
		System.out.println(digitCount);
	}

}
