package com.java.logicbuilding.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupicatesFromArraySolutionTwo {

	
	public static void main(String[] args) {
		
		int [] input = {10, 20,20,40,30,50,30};
		
		int[] result = removeDuplicates(input);
		System.out.println(Arrays.toString(result));
	}

	private static int[] removeDuplicates(int[] input) {

		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int num : input) {
			set.add(num);
		}
		
		int[] result = set.stream().mapToInt(Integer::intValue).toArray();
		
		return result;
	}
}
