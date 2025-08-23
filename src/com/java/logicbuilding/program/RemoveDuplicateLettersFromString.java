package com.java.logicbuilding.program;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromString {

	public static void main(String[] args) {

		String input = "Java";

		char[] inputArr = input.toCharArray();
		Set<Character> uniqueSet = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();

		for (char letter : inputArr) {
			if (uniqueSet.add(letter)) {
				sb.append(letter);
			}
		}

		System.out.println(sb.toString());

	}

}
