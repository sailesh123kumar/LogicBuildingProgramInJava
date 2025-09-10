package com.java.logicbuilding.program;

public class countVowelsinAstringSolutionOne {
	
	
	public static void main(String[] args) {
		String input = "sailesh kumar";
		countVowels(input);
	}

	private static void countVowels(String input) {
		
		int count = 0;
		
		String vowels = "AEIOUaeiou";
		
		for(int i=0; i<input.length();i++) {
			if(vowels.indexOf(input.charAt(i))>0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
