package com.logicbuilding.string.manipulation;

public class StringManipulationOnCountO {
	
	
	public static void main(String[] args) {
		
		String input = "Tomorrow";
		int oCount = 0;
		StringBuilder result = new StringBuilder();
		
		for(char current : input.toCharArray()) {
			
			if(current == 'o' || current == 'O') {
				oCount++;
				result.append("@".repeat(oCount));
			}
			result.append(current);
		}
		System.out.println(result);
	}

}
