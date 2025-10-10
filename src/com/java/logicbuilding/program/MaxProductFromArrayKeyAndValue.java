package com.java.logicbuilding.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxProductFromArrayKeyAndValue {
	
	public static void main(String[] args) {
		
		String [] input = {"xyz 9","abc 21","xyz 21"};
		
		Map<String , Integer> map = new HashMap<String, Integer>();
		
		for (String data : input) {
			
			String[] product = data.split(" ");
			String productName = product[0];
			int productValue = Integer.parseInt(product[1]);
			map.put(productName, map.getOrDefault(productName, 0)+productValue);
			
		}
		
		System.out.println(map);
		
		int maxValue = 0;
		String product = null;
		
		
		for(Entry<String , Integer> entrySet :map.entrySet()) {
			if(maxValue<entrySet.getValue()) {
				maxValue=entrySet.getValue();
				product = entrySet.getKey();
			}
		}
		
		System.out.println(product + " : " + maxValue);
		
				
		
	}

}
