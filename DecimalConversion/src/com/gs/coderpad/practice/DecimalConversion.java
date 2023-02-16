package com.gs.coderpad.practice;

public class DecimalConversion {

	public static void main(String[] args) {

		System.out.println(fractionRepresentation(1, 2) + " " + fractionRepresentation(1, 3) + " "
				+ fractionRepresentation(6, 11));

		if (fractionRepresentation(1, 2).equals("0.5") && fractionRepresentation(6, 11).equals("0.(54)")
				&& fractionRepresentation(1, 3).equals("0.(3)")) {
			System.out.println("All passed");
		} else {
			System.out.println("Failed");
		}

	}

	public static String fractionRepresentation(int num, int den) {
		float d = (float) num / (float) den;
		String number = String.valueOf(d);
		String result = "";
		String subString = number.substring(number.indexOf(".") + 1, number.length());
		result = number.substring(0, number.indexOf(".") + 1);

		String intermediateSubString = "";
		int i = 0;
		boolean repeated = false;
		while (i < subString.length()) {
			if (intermediateSubString.length() > 0 && (i + intermediateSubString.length() < subString.length())
					&& subString.substring(i, i + intermediateSubString.length()).equals(intermediateSubString)) {
				repeated = true;
				break;

			} else {
				intermediateSubString = intermediateSubString + subString.charAt(i);
				i++;
			}
		}

		if (repeated) {
			result = result + "(" + intermediateSubString + ")";
		} else {
			result = result + subString;
		}
		// System.out.println(result);
		return result;
	}
}
