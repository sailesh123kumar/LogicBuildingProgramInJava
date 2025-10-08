package com.java.logicbuilding.program;

import java.util.Arrays;

public class MaxProductOfTripletSolutionOne {

	public static void main(String[] args) {

		int input[] = { -10, 20, 7, -15, 9, 30 };

		int maxProdut = 0;

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;

		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int number : input) {

			if (number > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = number;
			}
			else if (number > secondMax && number != firstMax) {
				thirdMax = secondMax;
				secondMax = number;
			} else if (number > thirdMax) {
				thirdMax = number;
			}
			
			
			if(number<firstMin) {
				secondMin = firstMin;
				firstMin = number;
			}
			else if(number<secondMin && number != firstMin) {
				secondMin = number;
			}

		}

		int resultOne = firstMax * secondMax* thirdMax;
		int resultTwo = firstMin * secondMin * firstMax;

		System.out.println("Result One -> " + resultOne);
		System.out.println("Result Two -> " + resultTwo);

		maxProdut = Math.max(resultOne, resultTwo);

		System.out.println(maxProdut);

	}

}
