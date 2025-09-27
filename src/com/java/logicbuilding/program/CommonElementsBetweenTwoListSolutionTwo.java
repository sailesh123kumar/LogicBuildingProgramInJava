package com.java.logicbuilding.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoListSolutionTwo {

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
		
		Set<String> common = list1.stream()
									.filter(list2::contains)
										.collect(Collectors.toSet());
		System.out.println(common);
		
	}

}
