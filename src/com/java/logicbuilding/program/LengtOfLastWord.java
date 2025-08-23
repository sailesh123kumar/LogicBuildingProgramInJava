package com.java.logicbuilding.program;

public class LengtOfLastWord {

	public static void main(String[] args) {

		String input = "  I love Automation ";

		char[] inputArr = input.toCharArray();
		int lengthOfLastWord = 0;

		for (int i = inputArr.length-1; i >= 0; i--) {

			if (inputArr[i] != ' ') {
				lengthOfLastWord++;
			}
			else {
				if(lengthOfLastWord>0) {
					System.out.println(lengthOfLastWord);
					break;
				}
			}
		}

	}

}
