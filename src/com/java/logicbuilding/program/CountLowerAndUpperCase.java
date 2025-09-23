package com.java.logicbuilding.program;

public class CountLowerAndUpperCase {
	
	public static void main(String[] args) {
		
		String input = "Automation Test Engineer SDET";
		
		countLowerAndUpperCase(input);
		
	}

	private static void countLowerAndUpperCase(String input) {

		int lowerCaseCount =0;
		int upperCaseCount =0;
		
		char[] charArray = input.toCharArray();
		
		for(char current : charArray) {
			
			if(Character.isUpperCase(current)) {
				upperCaseCount++;
			}else if(Character.isLowerCase(current)) {
				lowerCaseCount++;
			}
		}
		
		System.out.println("UPPERCASE COUNT : "+upperCaseCount);
		System.out.println("LOWERCASE COUNT : "+lowerCaseCount);
		
	}

}
