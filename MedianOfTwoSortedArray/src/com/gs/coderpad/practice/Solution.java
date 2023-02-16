package com.gs.coderpad.practice;

import java.util.Arrays;

public class Solution {

	public static double logic(int[] nums1, int[] nums2) {
		int n=nums1.length+nums2.length;
        int m=nums1.length;
        int a[]=new int[n];
        int h=0;
        for(int i=0;i<n;i++){
            if(i<m)
             a[i]=nums1[i];
          else{
              a[i]=nums2[h];
              h++;
          }
        }
        Arrays.sort(a);
        if(a.length%2==0){
         int med=(0+(n-1))/2;
         double me=(a[med]+a[med+1])/2.0;
         
         
          return me;
        }
        else{
            int med=(0+(n-1))/2;
            double me=a[med];
            
            return me;
        }
       
    }
		
	

	public static boolean pass() {
		boolean result = true;
		result = result && logic(new int[] { 1, 2,3,4 }, new int[] { 5,6 }) == 3.5;
		return result;
	};

	public static void main(String[] args) {
		if (pass()) {
			System.out.println("pass");
		} else {
			System.out.println("some failures");
		}
	}
}