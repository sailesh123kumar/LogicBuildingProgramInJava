package com.java.logicbuilding.program;

public class ReplaceVowelsWithx {
	
	public static void main(String[] args) {
		
		String input="Automation";
		replaceVowels(input);
		
	}

	private static void replaceVowels(String input) {

		char[] charArray = input.toCharArray();
		StringBuilder result = new StringBuilder();
		for(char current : charArray) {
			if(isVowel(current)) {
				result.append('x');
			}
			else {
				result.append(current);
			}
		}
		System.out.println(result);
	}

	private static boolean isVowel(char current) {
		if(current == 'a' ||current == 'e' ||current == 'i' ||current == 'o' ||current == 'u' ||
				current == 'A' ||current == 'E' ||current == 'I' ||current == 'O'|| current == 'U') {
			return true;
		}
		return false;
	}

}
