package com.java.logicbuilding.program;

public class CountFrequencyOfCharacterWithoutMap {
	
	
	public static void main(String[] args) {
		
		String input = "delicious";
		char[] inputArr = input.toCharArray();
		int[] freqencyArr = new int[256];
		

		for(char currentChar:inputArr) {
			freqencyArr[currentChar]++;
		}
		
		for(int index=0 ; index<freqencyArr.length; index++) {
			if(freqencyArr[index]>=1) {
				
				System.out.println((char) index+" "+    freqencyArr[index]);
				
			}
		}
		
	}

}
