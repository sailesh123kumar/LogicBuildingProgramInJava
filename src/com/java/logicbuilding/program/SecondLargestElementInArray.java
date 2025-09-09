package com.java.logicbuilding.program;

public class SecondLargestElementInArray {

	public static void main(String[] args) {

		int input[] = {1,8,10,13,5,17};
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		
		for (int i = 0; i < input.length; i++) {
			
			if(input[i]>firstMax) {
				secondMax = firstMax;
				firstMax = input[i];
			}
			else if(input[i]>secondMax && input[i]!=firstMax) {
				secondMax=input[i];
			}
		}
		System.out.println(secondMax);
	}

}
