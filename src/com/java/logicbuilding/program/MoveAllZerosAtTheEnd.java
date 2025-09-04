package com.java.logicbuilding.program;

import java.util.Arrays;

public class MoveAllZerosAtTheEnd {

	public static void main(String[] args) {

		int input[] = { 1, 0, 2, 0, 3, 0 };

		System.out.println(Arrays.toString(input));
		moveZerosAtEnd(input);
	}

	private static void moveZerosAtEnd(int[] input) {

		int putNonZeroValue = 0;
		int temp = 0;

		for (int index = 0; index < input.length; index++) {

			if (input[index] != 0) {
				temp = input[putNonZeroValue];
				input[putNonZeroValue] = input[index];
				input[index] = temp;
				putNonZeroValue++;
			}
		}

		System.out.println(Arrays.toString(input));
	}

}
