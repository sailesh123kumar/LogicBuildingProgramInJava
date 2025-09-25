package com.java.logicbuilding.program;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfWord {
	
	public static void main(String[] args) {
		
		String input = "Hi How Are You , Are You from Where";
		countFrequencyOfWords(input);
		
	}

	private static void countFrequencyOfWords(String input) {

		
		Map<String , Integer> occurenceMap = new HashMap<String, Integer>();
		
		String[] words = input.split(" ");
		
		for (String word : words) {
			occurenceMap.put(word, occurenceMap.getOrDefault(word, 0)+1);
		}
		
		System.out.println(occurenceMap);
		
	}

}
