package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestElement {
	public static void main(String[] args) {
		int[] arr = {10,2,1,30,20};
		int largest = findLargest(arr);
		System.out.println(largest);
	}

	private static int findLargest(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		
		return Collections.max(list);
	}

	/*
	private static int findLargest(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	*/

	/*
	private static int findLargest(int[] arr) {
		int lar = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > lar) {
				lar = arr[i];
			}
		}
		return lar;
	}
	*/

}
