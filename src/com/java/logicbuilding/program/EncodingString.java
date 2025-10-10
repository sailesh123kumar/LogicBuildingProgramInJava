package com.java.logicbuilding.program;

public class EncodingString {
	
	public static void main(String[] args) {
		
		String input = "dddmmmmttaaa";
		
		char[] charArray = input.toCharArray();
		
		StringBuilder result = new StringBuilder();
		
		int count = 0;
		for(int i=1; i<charArray.length;i++) {
			
			if(charArray[i] == charArray[i-1]) {
				count++;
			}
			else {
				result.append(charArray[i-1]).append(count);
				count=1;
			}
		}
		
		result.append(charArray[charArray.length-1]).append(count);
		System.out.println(result);
		
	}

}
