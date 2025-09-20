package com.java.logicbuilding.program;

public class NameShortener {

	public static void main(String[] args) {

		String input = "Jatin Vishwanath Sharma";
		
		nameShortener(input);
		nameShortener("Sailesh Kumar");
		nameShortener("Venkatesan Sailesh Kumar");
	}

	private static void nameShortener(String input) {

		
		String[] nameParts = input.split(" ");
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < nameParts.length-1; i++) {
			result.append(nameParts[i].charAt(0)).append(". ");
		}
		result.append(nameParts[nameParts.length-1]);
		System.out.println(result);
		
	}

}
