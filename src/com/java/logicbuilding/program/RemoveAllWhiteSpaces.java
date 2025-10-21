package com.java.logicbuilding.program;

public class RemoveAllWhiteSpaces {
	
	public static void main(String[] args) {
		
		String input = "  Hello     World    ";
		
		input = input.trim();
		input = input.replaceAll("\\s+", " ");
		System.out.println(input);
		
	}

}
