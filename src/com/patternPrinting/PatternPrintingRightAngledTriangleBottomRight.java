package com.patternPrinting;

public class PatternPrintingRightAngledTriangleBottomRight {

	public static void main(String[] args) {

		int totalRow = 5;

		for (int row = 1; row <= totalRow; row++) {
			for (int col = row; col < totalRow; col++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= row; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
