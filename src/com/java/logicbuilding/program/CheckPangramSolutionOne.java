package com.java.logicbuilding.program;

import java.util.HashSet;
import java.util.Set;

public class CheckPangramSolutionOne {
	
	public static void main(String[] args) {
		
		String input = "The quick brown fox jumps over the lazy dog";
		checkPangram(input);
	}

	private static boolean checkPangram(String input) {
		int n = input.length();
		if(n<26) {
			return false;
		}
		
		input = input.toLowerCase();
		
		Set<Character> alphabets = new HashSet<Character>();
		char[] data = input.toCharArray();
		
		for(char letter: data) {
			if(Character.isLetter(letter)) {
				alphabets.add(letter);
			}
		}
		
		if(alphabets.size()==26) {
			System.out.println("It is Pangram");
			return true;
		}
		else
		{
			System.out.println("Not a Pangram");
			return false;
		}
		
		
	}

}
