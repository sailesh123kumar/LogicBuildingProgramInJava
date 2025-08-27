package com.patternPrinting;

public class PatternPrntingHollowTriangle {

	public static void main(String[] args) {

		int totalRow = 5;

		for (int i = 1; i <= totalRow; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == totalRow) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
