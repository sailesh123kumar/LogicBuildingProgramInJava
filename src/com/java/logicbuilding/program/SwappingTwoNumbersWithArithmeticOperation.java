package com.java.logicbuilding.program;

public class SwappingTwoNumbersWithArithmeticOperation {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		
		System.out.println("Before Swapping");
		System.out.println("a==> "+a);
		System.out.println("b==> "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping");
		System.out.println("a==> "+a);
		System.out.println("b==> "+b);
		
	}

}
