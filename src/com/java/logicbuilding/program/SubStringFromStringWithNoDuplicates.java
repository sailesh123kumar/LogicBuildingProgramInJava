package com.java.logicbuilding.program;

import java.util.LinkedHashSet;
import java.util.Set;

public class SubStringFromStringWithNoDuplicates {
	
	
	public static void main(String[] args) {
		
		String input = "aabbcdccd";
		
		char[] charArray = input.toCharArray();
		
		Set<Character> set = new LinkedHashSet<Character>();
		StringBuilder result = new StringBuilder();
		
		for (Character character : charArray) {
			
			if(set.add(character)) {
				result.append(character);
			}
			
		}
		
		System.out.println(result.toString());
		
		
	}

}
