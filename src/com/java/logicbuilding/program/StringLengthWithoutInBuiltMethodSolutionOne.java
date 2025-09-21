package com.java.logicbuilding.program;

public class StringLengthWithoutInBuiltMethodSolutionOne {
	
	public static void main(String[] args) {
		
		String input = "Selenium Java";
		int stringLengthWithoutInbuiltMethod = stringLengthWithoutInbuiltMethod(input);
		System.out.println(stringLengthWithoutInbuiltMethod);
	}

	private static int stringLengthWithoutInbuiltMethod(String input) {

		int length=0;
		while(true) {
			try {
				input.charAt(length);
				length++;
			}catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}
		return length;
	}

}
