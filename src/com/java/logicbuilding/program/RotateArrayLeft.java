package com.java.logicbuilding.program;

import java.util.Arrays;

public class RotateArrayLeft {

	public static void main(String[] args) {
		int input[] = { 1, 2, 3, 4, 5 ,6};
		int k = 2;
		rightRotateOfArray(input, k);
		
	}

	private static void rightRotateOfArray(int[] input, int k) {
		
		k = k%input.length;
		int left =0;
		int right = input.length-1;
		reverseArray(input ,0,k-1);
		reverseArray(input ,k,right);
		reverseArray(input ,left,right);
		
		
		
		System.out.println(Arrays.toString(input));
		
	}

	private static void reverseArray(int[] input, int left, int right) {
		
		while(left<right) {
			
			int temp = input[left];
			input[left]= input[right];
			input[right]= temp;
			left++;
			right--;
			
		}
		
	}
}
