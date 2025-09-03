package com.java.logicbuilding.program;

import java.util.Arrays;

public class ReverseAnArrayTwoPointerApproach {
	
	
	public static void main(String[] args) {
		
		int input [] = {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(input));
		
		reverse(input);
		
		System.out.println(Arrays.toString(input));
		
		
	}

	private static void reverse(int[] input) {
		
		int left = 0;
		int right = input.length - 1;
		int temp = 0;
		
		while(left<right) {
			temp = input[left];
			input[left]=input[right];
			input[right]=temp;
			left++;
			right--;
		}
		
	}

}
