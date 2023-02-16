package com.gs.coderpad.practice;

public class Solution {

	/**
	 * public static String reverseStr( String str ) Example: reverseStr(str) where
	 * str is "abcd" returns "dcba".
	 */
	public static String reverseStr(String str) {
		// your code goes here
		// ther will be some soultion with defect that would need to be identified
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		return sb.toString();
	};

	public static void main(String[] args) {

		
		boolean result = true;

		result = result && reverseStr("abcd").equals("dcba");

		if (result) {
			System.out.println("All tests pass");
		} else {
			System.out.println("There are test failures");
		}

	}

}
