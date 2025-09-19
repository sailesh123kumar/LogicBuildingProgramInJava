
package com.java.logicbuilding.program;

public class FirstAndLastOccurenceOfCharacter {

	public static void main(String[] args) {

		String input = "Hello World";

		int firstIndex = -1;
		int lastIndex = -1;

		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'o') {
				firstIndex = index;
				break;
			}
		}

		for (int index = input.length() - 1; index >= 0; index--) {
			if (input.charAt(index) == 'o') {
				lastIndex = index;
				break;
			}
		}

		if (firstIndex < 0) {
			System.out.println("Could not find the character");
		}
		else if(firstIndex == lastIndex){
			System.out.println("Character occurs only once in a string :"+firstIndex);
		}
		else {
			System.out.println("First Occurence : "+firstIndex);
			System.out.println("Last Occurence : "+lastIndex);
		}

		
		

	}
}
