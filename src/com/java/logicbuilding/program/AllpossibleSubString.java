package com.java.logicbuilding.program;

public class AllpossibleSubString {

	public static void main(String[] args) {
		String input = "Automation";
		allPossiblesubString(input);

	}

	private static void allPossiblesubString(String input) {
		for (int start = 0; start < input.length(); start++) {
			for (int end = start + 1; end <= input.length(); end++) {
				System.out.println(input.substring(start, end));
			}
		}
	}

}
