package com.java.logicbuilding.program;

public class NameGeneratorFromArray {
	
	
	public static void main(String[] args) {
		
		String[] input = {"Sailesh" , "Prathiksha" , "Viniksha" , "Asha"};
		
		int maxLength = 0;
		StringBuilder result = new StringBuilder();
		
		
		for(String name : input) {
			maxLength = Math.max(maxLength, name.length());
		}
		
		
		for(int index = 0 ; index < maxLength ; index++) {
			
			for(String word : input) {
				if(word.length() > index) {
					result.append(word.charAt(index));
				}
			}
		}
		System.out.println(result);
	}

}
