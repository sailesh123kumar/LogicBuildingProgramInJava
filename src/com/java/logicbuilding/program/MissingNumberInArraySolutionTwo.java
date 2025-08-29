package com.java.logicbuilding.program;

public class MissingNumberInArraySolutionTwo {

	public static void main(String[] args) {
		int input[] = { 1, 2, 4, 5, 6 };
		int n = 6;
		int result = n * (n + 1) / 2;
		int sumOfArray = 0;
		System.out.println("Result ==> " + result);

		for (int i = 0; i < input.length; i++) {
			sumOfArray += input[i];
		}

		System.out.println("Sum Of Array ==> " + sumOfArray);
		int missingNumber = result - sumOfArray;
		System.out.println("Missing Number is ==> " + missingNumber);
	}
}
