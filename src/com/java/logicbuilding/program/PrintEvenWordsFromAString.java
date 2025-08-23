package com.java.logicbuilding.program;

public class PrintEvenWordsFromAString {
	
	public static void main(String[] args) {
		
		String input = "The Sky is blue";
		
		String [] words = input.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word : words) {
			
			if(word.length()%2==0) {
				result.append(word+" ");
			}
		}
		
		System.out.println(result.toString().trim());
		
	}

}
