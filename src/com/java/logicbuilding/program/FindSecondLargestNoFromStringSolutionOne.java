package com.java.logicbuilding.program;

import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNoFromStringSolutionOne {

	public static void main(String[] args) {
		
		String input = "Num147";
		secondLargestNum(input);
		
	}

	private static void secondLargestNum(String input) {
		
		char[] charArray = input.toCharArray();
		TreeSet<Integer> numberSet = new TreeSet<Integer>();
		
		for(char current : charArray) {
			if(Character.isDigit(current)) {
				int numericValue = Character.getNumericValue(current);
				numberSet.add(numericValue);
			}
		}
		
		System.out.println(numberSet);
		Integer largest = numberSet.last();
		Integer secondLargest = numberSet.lower(largest);
		System.out.println("Second largest is : "+secondLargest);
		
	}
	
}
