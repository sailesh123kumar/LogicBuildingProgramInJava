package com.java.logicbuilding.program;

public class ConsecutiveNumWithTarget {

	
	public static void main(String[] args) {
		
		int input[] = {1,3,5,2,6,3,4,8,2};
		int target = 10;
		
		for(int i=0; i<input.length; i++) {
			int sum = input[i];
			for(int j=i+1 ; j<input.length ; j++) {
				
				sum=sum+input[j];
				
				if(sum==target) {
					for (int k = i; k <= j; k++) {
						System.out.print(input[k] + " ");
					}
					System.out.println(" ");
				}
				
				if(sum>target) {
					break;
				}
			}
			
			
			
		}
		
		
	}
}
