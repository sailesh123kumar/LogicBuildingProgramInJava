package com.java.logicbuilding.program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintUniqueElement {
	
	public static void main(String[] args) {
	
		String input = "Programming";
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		char[] dataArray = input.toCharArray();
		
		for(char current : dataArray) {
			map.put(current, map.getOrDefault(current, 0)+1);
		}
		
		for(Entry<Character,Integer> entrySet:map.entrySet()) {
			if(entrySet.getValue()==1) {
				System.out.println("key : "+entrySet.getKey() + " value : " +entrySet.getValue());
			}
		}
		
	}

}
