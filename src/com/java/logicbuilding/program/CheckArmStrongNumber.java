package com.java.logicbuilding.program;

public class CheckArmStrongNumber {

	public static void main(String[] args) {

		int number = 153;
		System.out.println(isArmstrong(number));
	}

	private static boolean isArmstrong(int number) {

		int copyNumber = number;

		int result = 0;

		while (copyNumber != 0) {

			int lastDigit = copyNumber % 10;
			result = result + lastDigit * lastDigit * lastDigit;
			copyNumber = copyNumber / 10;

		}

		if (result == number) {
			System.out.println("Given number is ArmStrong");
			return true;
		} else {
			System.out.println("Not a ArmStrong Number");
			return false;
		}

	}

}
