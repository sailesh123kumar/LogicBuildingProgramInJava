package com.java.logicbuilding.program;

public class StringLengthWithoutInBuiltMethodSolutionTwo {
	
	public static void main(String[] args) {
		
		String input = "Selenium Java";
		int stringLengthWithoutInbuiltMethod = stringLengthWithoutInbuiltMethod(input);
		System.out.println(stringLengthWithoutInbuiltMethod);
	}

	private static int stringLengthWithoutInbuiltMethod(String input) {

		char [] charArrray = input.toCharArray();
		int length =0;
		for(char current : charArrray) {
			length++;
		}
		return length;
	}

}
