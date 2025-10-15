package com.logicbuilding.string.manipulation;

public class SolutionOne_9_9_956 {
	
	
	public static void main(String[] args) {
		
		String input = "99956";
		
		char [] dataArray = input.toCharArray();
		StringBuilder result = new StringBuilder();
		
		for(int index = 0 ; index < dataArray.length-1 ; index++) {
			
			int currentNum = Character.getNumericValue(dataArray[index]);
			int nextNum = Character.getNumericValue(dataArray[index+1]);
			
			result.append(currentNum);
			
			if(currentNum%2 != 0 && nextNum%2 != 0 && currentNum==nextNum) {
				result.append('-');
			}
			
		}
		result.append(dataArray[dataArray.length-1]);
		System.out.println(result.toString());
		
	}

}
