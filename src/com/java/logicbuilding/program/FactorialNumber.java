package com.java.logicbuilding.program;

public class FactorialNumber {

	public static void main(String[] args) {

		int num = 5;
		int factorial = 1;
		
		for(int i = 1 ; i<=5 ; i++) {
			factorial = factorial*i;
		}
		
		System.out.println(factorial);
		
	}

}
