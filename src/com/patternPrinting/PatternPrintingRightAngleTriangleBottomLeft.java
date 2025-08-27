package com.patternPrinting;

public class PatternPrintingRightAngleTriangleBottomLeft {

	public static void main(String[] args) {

		int totalRow = 5;

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println("");
		}

	}
}
