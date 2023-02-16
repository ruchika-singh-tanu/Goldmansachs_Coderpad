package com.gs.coderpad.practice;

public class StairCase {
	
	public static void main(String[] args) {
		int stepCount = 3;
	
		System.out.println(climbStairs(stepCount));
	}

	private static int climbStairs(int stepCount) {
		if ( stepCount < 2 )
	        return 1;
	    else
	        return climbStairs(stepCount-1) + climbStairs(stepCount-2)+climbStairs(stepCount-3);
	}

		
	 

}
