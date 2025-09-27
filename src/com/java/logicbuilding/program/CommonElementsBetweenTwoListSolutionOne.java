package com.java.logicbuilding.program;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsBetweenTwoListSolutionOne {

	public static void main(String[] args) {

		
		List<String> list1 = new ArrayList<String>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Zero");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("One");
		list2.add("Two");
		list2.add("Ten");
		list2.add("Hundred");
		
		commonElementsBetweenTwoList(list1,list2);
		
		
	}

	private static void commonElementsBetweenTwoList(List<String> list1, List<String> list2) {
		list1.retainAll(list2);
		System.out.println(list1);
	}

}
