package com.java.logicbuilding.program;

import java.util.HashMap;

public class LongestSubArrayInAString {

	public static void main(String[] args) {

		String input = "abcdabbc";
		int longestSubStringLength = longestSubString(input);
		System.out.println(longestSubStringLength);
	}

	private static int longestSubString(String input) {

		char[] charArray = input.toLowerCase().toCharArray();

		int start = 0;
		int maxLentgth = 0;
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (int end = 0; end < charArray.length; end++) {
			char current = charArray[end];
			if (charMap.containsKey(current)) {
				start = Math.max(start, charMap.get(current) + 1);
			}
			charMap.put(current, end);
			maxLentgth = Math.max(maxLentgth, end - start + 1);

		}

		return maxLentgth;
	}

}
