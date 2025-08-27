package com.patternPrinting;

public class PatternPrintingLeftAngleTriangle {

	public static void main(String[] args) {

		int totalRow = 5;

		for (int row = totalRow; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
}
