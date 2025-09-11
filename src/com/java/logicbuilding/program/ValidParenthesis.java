package com.java.logicbuilding.program;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {

		String input = "()";
		System.out.println(isValidParenthesis(input));

	}

	private static boolean isValidParenthesis(String input) {
		char[] inputArray = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (Character currentChar : inputArray) {
			if (currentChar == '(') {
				stack.push(currentChar);
			} else {
				if (currentChar == ')') {
					if (stack.isEmpty()) {
						return false;
					} else {
						char topchar = stack.pop();
						if (topchar != '(') {
							return false;
						}
					}
				}

			}

		}
		return stack.isEmpty();
	}

}
