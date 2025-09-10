package com.java.logicbuilding.program;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {

		String input = "VIII";
		romanToInteger(input);

	}

	private static void romanToInteger(String input) {
		int previousValue = 0;
		int result = 0;
		char inputArray[] = input.toCharArray();
		
		Map<Character,Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('V', 5);
		romanMap.put('I', 1);
		romanMap.put('X', 10);
		romanMap.put('L', 50);

		for (int i = inputArray.length - 1; i >= 0; i--) {

			char currentChar = inputArray[i];
			int currentValue = romanMap.get(currentChar);
			
			if(currentValue>=previousValue) {
				result = result + currentValue;
			}
			else {
				result = result - currentValue;
			}
			
			previousValue=currentValue;
		}
		
		
		System.out.println(result);
	}

}
