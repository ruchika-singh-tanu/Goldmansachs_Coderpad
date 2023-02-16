package com.gs.coderpad.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianIntStream {

	public static void main(String[] args) {
		int arr[] = { 5, 15, 1, 3, 2, 8, 7, 9, 10, 6, 11, 4 };
		int n = arr.length;

		printMedian(arr, n);
	}

	private static void printMedian(int[] arr, int n) {
		
		List<Integer> numlist = new ArrayList<>();
		
		for(int i =0; i<n;i++) {
			numlist.add(arr[i]);
			double median = findMedian(numlist);
			System.out.println("Median for - "+numlist+ "is "+ median);
		}
		
	}

	private static double findMedian(List<Integer> numlist) {
		Collections.sort(numlist);
		int length = numlist.size();
		
		if (length == 1) {
			return numlist.get(0);
		}
		if(length % 2 == 1){
			return numlist.get(length/2);
		}
		
		return 0.5 * (numlist.get(length / 2) + numlist.get(length / 2 - 1));
	}

}
