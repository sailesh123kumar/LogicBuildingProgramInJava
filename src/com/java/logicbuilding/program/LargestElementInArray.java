package com.java.logicbuilding.program;

public class LargestElementInArray {

	public static void main(String[] args) {
		int input[] = { 1, 12, 34, 89, 75, 53 };

		int largest = input[0];

		for (int number : input) {
			if (number > largest) {
				largest = number;
			}
		}
		
		System.out.println(largest);
	}
}
