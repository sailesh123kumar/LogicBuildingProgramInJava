package com.java.logicbuilding.program;

public class SwappingTwoNumbersWithTempVar {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		int temp;
		
		System.out.println("Before Swapping");
		System.out.println("a==> "+a);
		System.out.println("b==> "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping");
		System.out.println("a==> "+a);
		System.out.println("b==> "+b);
		
	}

}
