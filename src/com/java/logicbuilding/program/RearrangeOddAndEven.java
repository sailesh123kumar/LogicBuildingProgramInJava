package com.java.logicbuilding.program;

import java.util.Arrays;

public class RearrangeOddAndEven {

	public static void main(String[] args) {

		int[] input = { 1, 4, 0, 2, 7, 9, 3, 5 };

		rearrangeOddAndEven(input);

	}

	private static void rearrangeOddAndEven(int[] input) {
		int left = 0;
		int right = input.length - 1;
		int temp = 0;
		while (left < right && input[left] % 2 == 0) {
			left++;
		}

		while (left < right && input[right] % 2 != 0) {
			right--;
		}

		while (left < right) {
			temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			left++;
			right--;
		}

		System.out.println(Arrays.toString(input));
		
		int evenEnd =0;
		
		for(int num : input) {
			if(num%2==0) {
				evenEnd++;
			}
		}
		
		System.out.println("Even End Index : "+evenEnd);
		
		Arrays.sort(input, 0, evenEnd);
		Arrays.sort(input, evenEnd, input.length-1);
		
		System.out.println(Arrays.toString(input));
		
	}

}
