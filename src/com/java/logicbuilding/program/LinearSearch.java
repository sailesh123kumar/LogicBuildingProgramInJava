package com.java.logicbuilding.program;

public class LinearSearch {

	
	public static void main(String[] args) {
		
		int input[] = {2,7,9,4,8};
		
		
		int validKey = 4;
		int inValidKey = 5;
		
		validatingPresenceOfkey(input, validKey);
		System.out.println("============");
		validatingPresenceOfkey(input, inValidKey);
		
		
		
	}

	private static void validatingPresenceOfkey(int[] input, int key) {
		boolean isKeyPresence = false;
		for(int current:input) {
			
			if(current == key) {
				isKeyPresence= true;
				break;
			}
		}
		
		if(isKeyPresence) {
			System.out.println("Key is found in the array");
		}
		else {
			System.out.println("key is not present in the array");
		}
	}
}
