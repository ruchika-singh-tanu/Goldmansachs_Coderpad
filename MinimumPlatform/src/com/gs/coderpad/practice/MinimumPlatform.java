package com.gs.coderpad.practice;

import java.util.Arrays;

public class MinimumPlatform {

	public static void main(String[] args) {
		 int arr[] = { 100, 300, 500 };
	        int dep[] = { 900, 400, 600 };
	        int n = arr.length;
	        System.out.println(findPlatform(arr, dep, n));
	}

	private static int findPlatform(int[] arr, int[] dep, int n) {
		
		int platFormNeeded =1;
		int result = 1;
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int i =1 ;
		int j =0;
		while (i<n && j < n) {
			
			if(arr[i] <= dep[j]) {
				platFormNeeded++;
				i++;
			}
		
			else if (arr[i] > dep[j]) { 
				platFormNeeded--; 
                j++; 
            } 
  
            if (platFormNeeded > result) 
                result = platFormNeeded; 
        } 
		
		return result;
	}

	
}
