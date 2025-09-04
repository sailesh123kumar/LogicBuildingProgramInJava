package com.java.logicbuilding.program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountTheFrequencyOfCharacterInString {
	
	
	public static void main(String[] args) {
		
		String input = "Entertainment";

		char inputArr[] = input.toLowerCase().toCharArray();
		
		Map<Character, Integer> charCoutntMap = new LinkedHashMap<Character,Integer>();
		
		for(char currentChar:inputArr) {
			charCoutntMap.put(currentChar, charCoutntMap.getOrDefault(currentChar, 0)+1);
		}
		
		
		for(char currentChar :charCoutntMap.keySet()) {
			
			System.out.println(currentChar+" : "+charCoutntMap.get(currentChar));
			
		}
		
	}

}
