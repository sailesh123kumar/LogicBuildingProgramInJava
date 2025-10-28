package com.java.logicbuilding.program;

public class StringRotation {
	
	
	public static void main(String[] args) {
		
		String input1 = "Interview";
		String input2 = "viewInter";
		
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		
		if(input1.length() == input2.length()) {
			String result = input1.concat(input1);
			if(result.contains(input2)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("Its not a rotated string");
			}
		}
		else {
			System.out.println("Its not a rotated string");
		}
		
		
	}

}
