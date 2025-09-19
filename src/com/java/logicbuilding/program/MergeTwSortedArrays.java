package com.java.logicbuilding.program;

import java.util.Arrays;

public class MergeTwSortedArrays {

	public static void main(String[] args) {

		int[] a = { 1, 3, 6, 8 };
		int[] b = { 2, 5, 7, 9, 11 };

		int a_Length = a.length;
		int b_Length = b.length;

		int[] result = new int[a_Length + b_Length];

		int p1 = 0;
		int p2 = 0;
		int p3 = 0;

		while (p1 < a_Length && p2 < b_Length) {
			if (a[p1] < b[p2]) {
				result[p3] = a[p1];
				p1++;
			} else {
				result[p3] = b[p2];
				p2++;
			}
			p3++;
		}

		while (p1 < a_Length) {
			result[p3] = a[p1];
			p1++;
			p3++;
		}

		while (p2 < b_Length) {
			result[p3] = b[p2];
			p2++;
			p3++;
		}

		System.out.println(Arrays.toString(result));

	}
}
