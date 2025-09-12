package com.java.logicbuilding.program;

import java.util.Iterator;

public class Montonic {
	
	
	public static void main(String[] args) {
		
		int input[] = {8,5,4,1};
		System.out.println(isMonotonic(input));
		
	}

	private static boolean isMonotonic(int[] input) {

		boolean isIncreasing = true;
		boolean isDecreasing = true;
		
		for (int i = 1; i < input.length; i++) {
			
			if(input[i-1]>input[i]) {
				isDecreasing=false;
			}
			else {
				isIncreasing=false;
			}
			
		}
		
		return (isIncreasing||isDecreasing);
		
		
	}

}
