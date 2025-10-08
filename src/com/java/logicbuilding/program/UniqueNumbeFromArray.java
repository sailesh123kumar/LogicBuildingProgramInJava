package com.java.logicbuilding.program;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbeFromArray {
	
	public static void main(String[] args) {
		int input [] = {1,2,3,1,2};
		
		Set<Integer> seen = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		
		for(int number : input) {
			if(!seen.add(number)) {
				duplicate.add(number);
			}
		}
		
		System.out.println("Seen : "+seen);
		System.out.println("Duplicate : "+duplicate);
		
		seen.removeAll(duplicate);
		
		System.out.println("Unique : "+seen); 
		
	}

}
