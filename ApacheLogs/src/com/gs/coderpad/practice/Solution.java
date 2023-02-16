package com.gs.coderpad.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

	public static void getMostFrequentIp(String[] logs) {
		HashMap<String, Integer> map = new HashMap<>();

		for (String log : logs) {
			String[] arr = log.split(" ");
			map.put(arr[0], map.getOrDefault(arr[0], 0) + 1);
		}

		List<String> mostFrequent = new ArrayList<>();
		int freq = 0;

		for (String ip : map.keySet()) {
			freq = Math.max(freq, map.get(ip));
		}

		for (String ip : map.keySet()) {
			if (map.get(ip) == freq)
				mostFrequent.add(ip);
		}

		System.out.println(mostFrequent);
	}

	public static void main(String[] args) {
		System.out.println("Most Frequent IP!");

		getMostFrequentIp(new String[] { "10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24",
				"10.0.0.2 - GET 2020-08-20", "10.0.0.3 - GET 2020-08-24", "10.0.0.3 - GET 2020-08-24",
				"10.0.0.3 - GET 2020-08-24", "10.0.0.4 - GET 2020-08-24", });
	}
}
