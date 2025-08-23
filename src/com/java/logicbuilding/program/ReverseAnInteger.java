package com.java.logicbuilding.program;

public class ReverseAnInteger {
	
	
	public static void reverseaInteger(int num) {
		
		int lastDigit;
		int reverse = 0;
		
		while (num !=0) {
			
			lastDigit = num%10;
			
			//check for overflow
			if(reverse > Integer.MAX_VALUE / 10 || reverse == Integer.MAX_VALUE / 10 && lastDigit > 7) {
				System.out.println(0);
				System.exit(0);
			}
			
			//check or underflow
			if(reverse < Integer.MIN_VALUE / 10 || reverse == Integer.MIN_VALUE / 10 && lastDigit < 8) {
				System.out.println(0);
				System.exit(0);
			}
			
			reverse = reverse*10 + lastDigit;
			num = num/10;
			
		}
		
		System.out.println(reverse);
		
	}

	public static void main(String[] args) {

		reverseaInteger(123);
		reverseaInteger(120);
		reverseaInteger(138);
		reverseaInteger(2147483647);
		
	}

}
