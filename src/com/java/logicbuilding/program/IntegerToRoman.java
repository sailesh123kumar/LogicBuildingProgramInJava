package com.java.logicbuilding.program;

public class IntegerToRoman {

	public static void main(String[] args) {
		
		
		int input = 24;
		
		String [] romanArray = {"L","XL","X","IX","V","IV","I"};
		int [] value = {50,40,10,9,5,4,1};
		
		StringBuilder result = new StringBuilder();
		int copyNumber = input;

		for(int i=0; i<romanArray.length;i++) {
			
			while(copyNumber>=value[i]) {
				copyNumber = copyNumber - value[i];
				result.append(romanArray[i]);
			}
			
		}
		System.out.println(result.toString());
		

	}

}
