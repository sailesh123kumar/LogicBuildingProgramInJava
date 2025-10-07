package com.java.logicbuilding.program;

import java.util.Arrays;

public class MaxProductOfTripletSolutionOne {
	
	public static void main(String[] args) {
		
		int input[] = {-10,20,7,-15,9,30};
		Arrays.sort(input);
		
		System.out.println(Arrays.toString(input));
		
		int maxProdut = 0;
		
		int resultOne = Math.max(maxProdut, input[0]*input[1]*input[input.length-1]);
		int resultTwo = Math.max(maxProdut, input[input.length-2]*input[input.length-3]*input[input.length-1]);
		
		System.out.println("Result One -> "+resultOne);
		System.out.println("Result Two -> "+resultTwo);
		
		maxProdut = Math.max(resultOne, resultTwo);
		
		System.out.println(maxProdut);
		
	}

}
