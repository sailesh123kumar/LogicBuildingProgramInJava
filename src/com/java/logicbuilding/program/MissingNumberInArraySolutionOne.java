package com.java.logicbuilding.program;

public class MissingNumberInArraySolutionOne {

	public static void main(String[] args) {
		int input[] = { 1, 2, 4, 5, 6 };
		int n = 6;

		int missingNumber = 0;

		for (int number : input) {
			missingNumber = missingNumber ^ number;
		}

		for (int i = 0; i <= n; i++) {
			missingNumber = missingNumber ^ i;
		}

		System.out.println(missingNumber);
	}
}
