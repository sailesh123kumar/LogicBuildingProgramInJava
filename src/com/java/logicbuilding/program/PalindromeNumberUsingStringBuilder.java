package com.java.logicbuilding.program;

public class PalindromeNumberUsingStringBuilder {

	public static void main(String[] args) {

		int input = 121;
		
		String originalNumberString = String.valueOf(input);
		StringBuilder result = new StringBuilder(originalNumberString);
		int reversedNumber = Integer.parseInt(result.reverse().toString());
		
		if(reversedNumber - input == 0) {
			System.out.println("The Number is Palindrome");
		}
		else {
			System.out.println("Number is not a Palindrome");
		}
		
		
	}

}
