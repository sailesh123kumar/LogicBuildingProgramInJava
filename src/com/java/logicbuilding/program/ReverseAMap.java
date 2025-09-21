package com.java.logicbuilding.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ReverseAMap {

	
	public static void main(String[] args) {
		
		Map<String , Integer> ogMap = new HashMap<String , Integer>();
		ogMap.put("A", 1);
		ogMap.put("B", 2);
		ogMap.put("C", 3);
		
		Map<Integer,String> reverseMap = new HashMap<Integer,String>();
		
		for(Entry<String, Integer> data : ogMap.entrySet()) {
			reverseMap.put(data.getValue(), data.getKey());
		}
		
		System.out.println("original map : "+ogMap);
		System.out.println("reversed map : "+reverseMap);
		
	}
}
