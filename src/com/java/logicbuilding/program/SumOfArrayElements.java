package com.java.logicbuilding.program;

public class SumOfArrayElements {
	int[] input = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5 };
		int result = 0;
		
		for(int number:input) {
			result+=number;
		}
		
		System.out.println(result);
	}
}
