package com.java.logicbuilding.program;

public class CheckMountainArray {
	
	public static void main(String[] args) {
		
		int a[] = {1,5,8,9,4,2,0};
		
		boolean checkMountainArry = checkMountainArry(a);
		System.out.println(checkMountainArry);
		
		
	}

	private static boolean checkMountainArry(int[] a) {
		int index= 0;
		if(a.length<3) {
			return false;
		}
		else {
			while(index>=0 && a[index]<a[index+1]) {
				index++;
			}
			
			while(index<a.length-1 && a[index]>a[index+1]) {
				index++;
			}
		}
		
		return index==a.length-1;
		
	}

}
