package com.java.logicbuilding.program;

public class WordFinder_Largest_Smallest {
	
	
	public static void main(String[] args) {
		
		String input = "I am a automation test engineer who works to find bugs in software testing";
		
		String[] words = input.split(" ");
		
		int smallest =words[0].length();
		int longest =words[0].length();
		
		for(String word : words) {
			
			if(smallest>word.length()) {
				smallest = word.length();
			}
			
			if(longest<word.length()) {
				longest = word.length();
			}
		}
		
		System.out.println(smallest);
		System.out.println(longest);
		
	}

}
