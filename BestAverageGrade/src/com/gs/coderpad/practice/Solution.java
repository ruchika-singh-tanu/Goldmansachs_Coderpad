package com.gs.coderpad.practice;

import java.util.HashMap;
import java.util.Map;


public class Solution {
	
	private static class  Node{
        int total,freq;
        Node(int total, int freq){
            this.total = total;this.freq=freq;
        }
	}
	public static Integer bestAvgGrade(String[][] scores) {
		
		HashMap<String, Node> mp = new HashMap<>();
        for(int i=0;i<scores.length;i++){
            mp.putIfAbsent(scores[i][0], new Node(0,0));
            Node curr = mp.get(scores[i][0]);
            mp.put(scores[i][0], new Node(curr.total+Integer.parseInt(scores[i][1]), curr.freq+1));
        }
        int ans = 0;
        for(Map.Entry<String, Node>e:mp.entrySet()){
            ans = Math.max(ans, e.getValue().total/e.getValue().freq);
        }
        return ans;
	}

	public static boolean pass() {
		String[][] s1 = { { "Rohan", "84" }, { "Sachin", "102" }, { "Ishan", "55" }, { "Sachin", "18" } };

		return bestAvgGrade(s1) == 84;
	}

	public static void main(String[] args) {
		if (pass()) {
			System.out.println("Pass");
		} else {
			System.out.println("Some Fail");
		}
	}
	}
