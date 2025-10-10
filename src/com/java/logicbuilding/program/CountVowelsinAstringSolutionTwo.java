package com.java.logicbuilding.program;

public class CountVowelsinAstringSolutionTwo {
	
	
	public static void main(String[] args) {
		String input = "sailesh kumar";
		countVowels(input);
	}

	private static void countVowels(String input) {
		
		int count = 0;
		char[] inputArray = input.toLowerCase().toCharArray();
		
		for(int i=0 ; i<inputArray.length ;i++) {
			if(inputArray[i]=='a'||inputArray[i]=='e'||inputArray[i]=='i'||inputArray[i]=='o'||inputArray[i]=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
