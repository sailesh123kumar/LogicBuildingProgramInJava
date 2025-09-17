package com.java.logicbuilding.program;

public class SeperateNumericAndString {
	
	public static void main(String[] args) {
		
		String input = "Ra123j";
		numericAndStringSeperator(input);
	}

	private static void numericAndStringSeperator(String input) {

		char [] inputArray = input.toCharArray();
		
		StringBuilder name = new StringBuilder();
		StringBuilder number = new StringBuilder();
		
		for(int index=0;index<inputArray.length ; index++) {
			
			if(Character.isAlphabetic(inputArray[index])) {
				name.append(inputArray[index]);
			}
			else if(Character.isDigit(inputArray[index])) {
				number.append(inputArray[index]);
			}
		}
		
		System.out.println(name.toString());
		System.out.println(number.toString());
		
	}

}
