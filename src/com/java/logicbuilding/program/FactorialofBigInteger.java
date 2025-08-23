package com.java.logicbuilding.program;

import java.math.BigInteger;

public class FactorialofBigInteger {

	public static void main(String[] args) {

		int number = 50;
		BigInteger factorial = BigInteger.ONE;
		
		for(int i=1 ; i<=number ; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(factorial);                                                                                  
		
	}

}
