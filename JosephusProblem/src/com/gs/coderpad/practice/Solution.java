package com.gs.coderpad.practice;

import java.util.ArrayList;
import java.util.List;

public class Solution {


	 
	 
	  static void Josh(List<Integer> person, int k, int index)
	  {
	     
	    
	    if (person.size() == 1) {
	      System.out.println(person.get(0));
	      return;
	    }
	 
	    
	    index = ((index + k) % person.size());
	 
	   
	    person.remove(index);
	 
	    
	    Josh(person, k, index);
	  }
	 
	  
	  public static void main(String [] args)
	  {
	    int n = 5; 
	    int k = 2;
	    k--; 
	    int index = 0; 
	 
	    List<Integer> person = new ArrayList<>();
	     
	   
	    for (int i = 1; i <= n; i++) {
	      person.add(i);
	    }
	 
	    Josh(person, k, index);
	  }

}
