package com.java.logicbuilding.program;

public class LinearSearchForIndex {

	public static void main(String[] args) {

		int input[] = { 2, 7, 9, 4, 8 };

		int validKey = 4;
		int inValidKey = 5;

		validatingPresenceOfkey(input, validKey);
		System.out.println("============");
		validatingPresenceOfkey(input, inValidKey);

	}

	private static void validatingPresenceOfkey(int[] input, int key) {
		int keyIndex = -1;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == key) {
				keyIndex = index;
				break;
			}
		}

		if (keyIndex >= 0) {
			System.out.println("Key is found in the array at the index ==> " + keyIndex);
		} else {
			System.out.println("key is not present in the array");
		}
	}
}
