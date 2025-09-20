package com.java.logicbuilding.program;

import java.util.ArrayList;

public class CheckEvenOrOddInArrayList {
	
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(true);
		al.add(22.6);
		al.add(null);
		al.add(12);
		al.add(13);
		
		
		for (int index = 0; index < al.size(); index++) {
			
			Object object = al.get(index);
			if(object instanceof Integer) {
				Integer i = (Integer) object;
				
				int currentValue = i.intValue();
				
				if(currentValue%2==0) {
					System.out.println("It is a Even number : "+currentValue);
				}
				else {
					System.out.println("It is a Odd number : "+currentValue);
				}
			}
			
		}
		
		
	}

}
