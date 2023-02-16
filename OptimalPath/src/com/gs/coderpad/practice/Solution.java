package com.gs.coderpad.practice;

import java.util.Arrays;

public class Solution {

	
	public static Integer optimalPath(Integer[][] grid) {

		int total =0;
		
		if (grid == null || grid.length == 0) throw new IllegalArgumentException("grid cannot be empty");
		
		//the starting total is the value of the first position (bottom left)
		total = grid[grid.length - 1][0];
		
		//if we have only entry in the matrix then its value is the total. this represents the base case for the recursion.
		if (grid.length == 1 && grid[0].length == 1) {
			return total;
		}
		
		//if we only have one array then we can't move up and so the total will be the total of this array
		if (grid.length == 1) {
			Integer[] newIntArray;
			newIntArray = Arrays.copyOfRange(grid[0], 1, grid[0].length);
			Integer [][] newGrid = {newIntArray};
			return total += optimalPath(newGrid);
		}
		
		//if the length of the top row is one (and as all arrays are the same length) then we can total up the one value in each of the arrays 
		if (grid[0].length == 1) {
			Integer [][] newGrid = new Integer[1][1];
			newGrid[0][0] = grid[0][0];
			return total += optimalPath(newGrid);
		}
		//we have two choices: move up or move along
		else {
			//the up path choice involves creating a new grid with the left most corner being the position directly above the current position
			Integer[][] upPathGrid = new Integer[grid.length - 1][];
			for (int i = grid.length - 2; i >= 0; i--) {
				upPathGrid[i] = Arrays.copyOfRange(grid[i], 0, grid[0].length);
			}
			//the along path choice involves creating a new grid with the left most corner being the position directly to the right of the current position
			Integer [][] alongPathGrid = new Integer[grid.length][grid[0].length - 1];
			for (int i = grid.length -1; i >= 0; i--) {
				alongPathGrid[i] = Arrays.copyOfRange(grid[i], 1, grid[0].length);
			}
			// apply recursion: add the current total to the maximum value of either the up or along paths. this line is where the "magic" resides
			// and to understand it properly I recommend watching a YouTube video on "back tracking" algorithms.
			return total += Math.max(optimalPath(upPathGrid), optimalPath(alongPathGrid));
		}
	}

	public static boolean doTestsPass() {
		boolean result = true;
		result &= optimalPath(new Integer[][] { { 0, 0, 0, 0, 5 }, { 0, 1, 1, 1, 0 }, { 2, 0, 0, 0, 0 } }) == 10;
		return result;
	}

	public static void main(String[] args) {
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("Tests fail.");
		}
	}

}
