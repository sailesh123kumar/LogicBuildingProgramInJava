package com.java.logicbuilding.program;

import java.util.HashMap;
import java.util.Map;

public class CheckFrequencyOfSpecialCharacter {

	
	public static void main(String[] args) {
		
		String input = "sai##!$$^&12(";
		char[] inputArr = input.toCharArray();
		Map<Character,Integer> specialCharMap = new HashMap<Character,Integer>();
		for(int i = 0; i<inputArr.length ; i++) {
			
			if(!Character.isAlphabetic(inputArr[i]) && !Character.isDigit(inputArr[i])) {
				specialCharMap.put(inputArr[i], specialCharMap.getOrDefault(inputArr[i], 0)+ 1);
			}
		}
		System.out.println(specialCharMap);
	}
}
