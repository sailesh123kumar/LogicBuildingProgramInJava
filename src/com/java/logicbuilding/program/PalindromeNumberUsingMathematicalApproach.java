package com.java.logicbuilding.program;

public class PalindromeNumberUsingMathematicalApproach {

	public static void main(String[] args) {

		int input = 1221;
		System.out.println(checkPalindrome(input));

	}

	private static boolean checkPalindrome(int input) {

		int copyNumber = input;
		int lastDigit;
		int result = 0;

		while (copyNumber != 0) {

			lastDigit = copyNumber % 10;
			result = result * 10 + lastDigit;
			copyNumber = copyNumber / 10;

		}
		
		
		if(result == input) {
			System.out.println("The given Number is Plaindrome");
			return true;
		}
		else {
			return false;
		}

	}
}
