package com.gs.coderpad.practice;

public class Solution {

	private static int minimalSteps(String ingredients) {
		int n = ingredients.length();
		if (n == 0) {
			return 0;
		}
		StringBuilder magicPotion = new StringBuilder();
		// add first character
		magicPotion.append(ingredients.charAt(0));

		for (int i = 1; i < n; i++) {

			if (i * 2 <= n) {
				String stringToCompare = ingredients.substring(0, i);

				if (stringToCompare.equals(ingredients.substring(i, 2 * i))) {
					magicPotion.append("*");
					i = 2 * i - 1; // a -1 here as there is already a ++i in for loop
				} else {
					magicPotion.append(ingredients.charAt(i));
				}
			} else { // i*2 has crossed n, simply add the characters
				magicPotion.append(ingredients.charAt(i));
			}
		}
		System.out.println(ingredients + "\t" + magicPotion);

		return magicPotion.length();

	}

	public static void main(String[] args) {

		if (minimalSteps("ABABCABABCE") == 6 && minimalSteps("ABCABCE") == 5) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
