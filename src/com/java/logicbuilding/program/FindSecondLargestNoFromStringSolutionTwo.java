package com.java.logicbuilding.program;

public class FindSecondLargestNoFromStringSolutionTwo {

	public static void main(String[] args) {
		
		String input = "Num147";
		secondLargestNum(input);
		
	}

	private static void secondLargestNum(String input) {
		
		char[] charArray = input.toCharArray();
		int num;
		int first=0;
		int second=0;
		for(char current : charArray) {
			if(Character.isDigit(current)) {
				num = current - '0';
				
				if(num>first) {
					second=first;
					first=num;
				}
				else if(num>second && num<first) {
					second = num;
				}
			}
		}
		
		System.out.println("Second Largest number is : "+second);
	}
	
}
