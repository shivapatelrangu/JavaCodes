package Arrays;

import java.util.Arrays;

public class TwoArraysAreEqualOrNot {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,2,3,4};
		boolean res = twoArraysAreEqualOrNot(a,b);
		if(res) {
			System.out.println("Two arrays are equal");
		}
		else {
			System.out.println("two arrays are not equal");
		}
	}

	private static boolean twoArraysAreEqualOrNot(int[] a, int[] b) {
		boolean res = Arrays.equals(a, b);
		return res;
	}

	/*
	private static boolean twoArraysAreEqualOrNot(int[] a, int[] b) {
		if(a.length == b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i] != b[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	*/

}
