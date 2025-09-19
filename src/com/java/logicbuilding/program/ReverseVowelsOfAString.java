package com.java.logicbuilding.program;

public class ReverseVowelsOfAString {
	
	
	public static void main(String[] args) {
		
		String input = "Automation";
		
		String result = reverseAVowel(input);
		System.out.println(result);
	}

	private static String reverseAVowel(String input) {

		String vowelString = "AEIOUaeiou";
		
		StringBuilder result = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		int left = 0;
		int right = charArray.length-1;
		
		while(left<right) {
			
			if(vowelString.indexOf(charArray[left])==-1) {
				left++;
			}
			else if(vowelString.indexOf(charArray[right])==-1) {
				right--;
			}
			else {
				char temp = charArray[left];
				charArray[left]= charArray[right];
				charArray[right]= temp;
				left++;
				right--;
			}
			
			
			
			
		}
		return result.append(charArray).toString();
		
	}

}
