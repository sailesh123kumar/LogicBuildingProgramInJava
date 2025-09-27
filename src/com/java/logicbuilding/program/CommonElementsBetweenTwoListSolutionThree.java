package com.java.logicbuilding.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsBetweenTwoListSolutionThree {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Zero");
		list1.add("Five");

		List<String> list2 = new ArrayList<String>();
		list2.add("One");
		list2.add("Two");
		list2.add("Ten");
		list2.add("Hundred");

		commonElementsBetweenTwoList(list1, list2);

	}

	private static void commonElementsBetweenTwoList(List<String> list1, List<String> list2) {
		Set<String> set = new HashSet<String>();
		for (int index = 0; index < list1.size(); index++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.contains(list2.get(j))) {
					set.add(list2.get(j));
				}
			}
		}
		System.out.println(set);
	}

}
