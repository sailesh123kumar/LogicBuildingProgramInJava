package com.java.logicbuilding.program;

public class CheckpangramSolutionTwo {

	public static void main(String[] args) {

		String input = "The quick brown fox jumps over the lazy dog";
		System.out.println(checkPangram(input));
	}

	private static boolean checkPangram(String input) {

		if (input.length() < 26) {
			return false;
		}

		input = input.toLowerCase();

		for (char i = 'a'; i <= 'z'; i++) {
			if (input.indexOf(i) < 0) {
				return false;
			}
		}
		return true;
	}

}
