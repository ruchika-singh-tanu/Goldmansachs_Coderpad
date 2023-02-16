package com.gs.coderpad.practice;

import java.util.HashMap;

public class Solution {
	
	public static void main(String[] args) {
        String[] array = {"to", "banana", "toe", "dogs", "ababcd", "elephant"};
        String input = "ote";

        System.out.println(getLargestWordFromDictionary(array, input));

    }
		


	    private static String getLargestWordFromDictionary(String[] array, String input){

	        HashMap<Character, Integer> frequencyMap = new HashMap<>();
	        int max = Integer.MIN_VALUE;
	        String resultString = "";
	        for (Character c: input.toCharArray())
	            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);

	        for (String s: array){
	            int i = 0;
	            HashMap<Character, Integer> frequencyMapClone = new HashMap<>(frequencyMap);
	            while (i < s.length() && frequencyMapClone.getOrDefault(s.charAt(i), 0) > 0){
	                frequencyMapClone.put(s.charAt(i), frequencyMap.get(s.charAt(i))-1);
	                i++;
	            }
	            if (i == s.length() && max < s.length()){
	                max = s.length();
	                resultString = s;
	            }
	        }
	        return resultString;
	    }

}
