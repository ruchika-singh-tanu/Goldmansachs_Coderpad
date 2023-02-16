package com.gs.coderpad.practice;

import java.util.Arrays;

public class Solution {
	
	public static int firstUniqChar(String s) {
        int[] map = new int[26];
        Arrays.fill(map, -1);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map[ch-'a']>=0){
                map[ch-'a']=-2;
            }else if(map[ch-'a']==-1){
                map[ch-'a']=i;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<26;j++){
            if(map[j]>=0){
                min=Math.min(min, map[j]);
            }
        }
        
        return (min==Integer.MAX_VALUE)? -1 : min;
    } 

	public static void main (String args[]) {
		System.out.println("First Unique character :"+firstUniqChar("aaaaxfffrg"));
	}
}
