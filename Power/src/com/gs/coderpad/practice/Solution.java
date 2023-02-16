package com.gs.coderpad.practice;

import java.util.ArrayList;

public class Solution {

	public static double power(double base, int exp) {
		// your code
		ArrayList<Integer> bitExp = new ArrayList<>();
		while (exp > 0) {
			if (exp % 2 != 0) {
				bitExp.add(1);
			} else {
				bitExp.add(0);
			}
			exp = exp / 2;
		}
		double ans = 1;
		double basePower = base;
		for (int x : bitExp) {
			if (x == 1) {
				ans = ans * basePower;
			}
			basePower = basePower * basePower;
		}
		return ans;
	}

	/* returns true if all tests pass, false otherwise */
	public static boolean doTestsPass() {
		boolean doTestsPass = true;
		double result = power(4, 3);
		return doTestsPass;
	}

	public static void main(String[] args) {
		if (doTestsPass())
			System.out.println("All Tests Pass");
		else
			System.out.println("There are test failures");
	}

}
