package com.java.logicbuilding.program;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,2,1,3};
		int b[] = {2,2,3};
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> intersect = new HashSet<Integer>();
		
		for(int number:a) {
			set1.add(number);
		}
		
		for(int number : b) {
			if(set1.contains(number)) {
				intersect.add(number);
			}
		}
		
		System.out.println(intersect);
		
	}

}
