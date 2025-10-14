package com.interview.question.post.socialmedia;

public class PatternPrintinginNumbers {
	
	public static void main(String[] args) {
		int num = 6;
		for (int i = 1; i <= num ; i++) {
			
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		for (int i = 1; i < num; i++) {
			for (int j = 1; j < num - i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
	}

}
