package com.java.logicbuilding.program;

import java.util.Arrays;

public class ReverseAnArray {

	
	public static void main(String[] args) {
		
		int input[] = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(input));
		
		int[] result = reverse(input);
		
		System.out.println(Arrays.toString(result));
		
	}

	private static int[] reverse(int[] input) {

		int[] output = new int[input.length];
		
		int outputIndex = 0;
		
		for(int index = input.length-1 ; index>=0 ; index--) {
			
			output[outputIndex++] = input[index];
		}
		return output;
	}
	
	
}
