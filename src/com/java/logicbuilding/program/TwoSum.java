package com.java.logicbuilding.program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int input[] = {2,1,4,4,3};
		
		int target = 7;
		int[] twoSum = twoSum(input, target);
		System.out.println(Arrays.toString(twoSum ));
		
		
	}

	private static int[] twoSum(int[] input, int target) {
		Map<Integer,Integer> sumMap = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < input.length; i++) {
			int compliment = target - input[i];
			if(sumMap.containsKey(compliment)) {
				return new int []{sumMap.get(compliment),i};
			}
			sumMap.put(input[i], i);
		}
		return null;
	}

}
