package com.java.logicbuilding.program;

public class DecodingString {
	
	public static void main(String[] args) {
		
		String input = "d3m4t2b0a1";
		
		char [] inputArr = input.toCharArray();
		StringBuilder result = new StringBuilder();
		
		for(int i=1;i<inputArr.length;i+=2) {
			int count = Character.getNumericValue(inputArr[i]);
			for(int j=0;j<count;j++) {
				result.append(inputArr[i-1]);
			}
		}
		System.out.println(result.toString());
		
	}

}
