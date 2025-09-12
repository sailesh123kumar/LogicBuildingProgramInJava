package com.java.logicbuilding.program;

public class ChangingKeys {

	public static void main(String[] args) {

		
		String input = "abBcd";
		
		int changingKeysCount = changingKeysCount(input);
		System.out.println(changingKeysCount);
	}

	private static int changingKeysCount(String input) {

		int count= 0;
		
		char[] charArray = input.toLowerCase().toCharArray();
		char lastKey = charArray[0];
		
		for (int i = 1; i < charArray.length; i++) {
			if(lastKey!=charArray[i]) {
				count++;
			}
			lastKey=charArray[i];
		}
		
		return count;
	}

}
