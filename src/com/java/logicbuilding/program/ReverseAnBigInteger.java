package com.java.logicbuilding.program;

public class ReverseAnBigInteger {
	
	
	public static void reverseaInteger(int num) {
		
		int lastDigit;
		int reverse = 0;
		
		while (num !=0) {
			
			lastDigit = num%10;
			reverse = reverse*10 + lastDigit;
			num = num/10;
			
		}
		
		System.out.println(reverse);
		
	}

	public static void main(String[] args) {

		reverseaInteger(123);
		reverseaInteger(120);
		reverseaInteger(138);
		
	}

}
