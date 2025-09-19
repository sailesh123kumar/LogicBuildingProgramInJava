package com.java.logicbuilding.program;

public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		
		int noOfFibonaaciToPrint = 10;
		
		printFibonacci(noOfFibonaaciToPrint);
		
	}

	private static void printFibonacci(int noOfFibonaaciToPrint) {

		int first = 0;
		int second = 1;
		
		System.out.print(first +" "+second+ " ");
		int count = 2 ;
		
		while(noOfFibonaaciToPrint>count) {
			int next = first + second;
			System.out.print(next+ " ");
			
			first = second;
			second = next;
			count++;
		}
		
	}

}
