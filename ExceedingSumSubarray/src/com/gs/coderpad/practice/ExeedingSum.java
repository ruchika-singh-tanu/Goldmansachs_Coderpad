package com.gs.coderpad.practice;

public class ExeedingSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
	
		boolean result = true; 
		  
		  result = result && subArrayExceedsSum( arr, 6 ) == 2;
		  result = result && subArrayExceedsSum( arr, 12 ) == -1;

		  if( result )
		  {
		    System.out.println("All tests pass\n");
		  }
		  else
		  {
		    System.out.println("There are test failures\n");
		  }
		  }
	

	  public static int subArrayExceedsSum(int nums[], int target )
	  {
		  int result=Integer.MAX_VALUE;
	      int left=0;
	      int sum=0;
	      for(int i=0;i<nums.length;i++){
	        sum+=nums[i];
	         while(sum>=target){
	             result=Math.min(result,i+1-left);
	             sum-=nums[left];
	             left++;
	         }
	      }
	         return result!=Integer.MAX_VALUE? result:-1;
	      }
	  }

