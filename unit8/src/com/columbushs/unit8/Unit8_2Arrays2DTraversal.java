package com.columbushs.unit8;

public class Unit8_2Arrays2DTraversal {
	
	public void TwoDArrayTravFor() {
		
		String [][] nameGrid = { 
				{"Bob","Tom","John","James"},
				{"Mary","Jimmy","Mark","Ralph"},
				{"Tim","Hugh","Apple","Greg"}
				}; 
		
		//number of rows given by .length
		
		for (int row=0; row<nameGrid.length;row++) {
			
			//number of columns given by length of first row.
			
			for (int col = 0; col<nameGrid[0].length;col++) {
				
				System.out.print(nameGrid[row][col] + " ");
			}
			
			System.out.println();
			
		}
		
			
	}
	
	public void TwoDArrayTravEnhanced() {
		
		int [][] numGrid = { 
				{1,3,5,7},
				{9,11,13,15},
				{17,19,21,23}
				}; 
		
		//remember 2D Array is an array of arrays
		for(int[] row:numGrid) {
			
			for (int number:row) {
				
				System.out.print(number+" ");
				
			}
			
			System.out.println();
		}
		
		
	}
	
	public void TwoDArrayTravRowMajor() {
		
		//Traverse going across
		
		String [][] nameGrid = { 
				{"Bob","Tom","John","James"},
				{"Mary","Jimmy","Mark","Ralph"},
				{"Tim","Hugh","Apple","Greg"}
				}; 
		
		//number of rows given by .length
		
		for (int row=0; row<nameGrid.length;row++) {
			
			//number of columns given by length of first row.
			
			for (int col = 0; col<nameGrid[0].length;col++) {
				
				System.out.print(nameGrid[row][col] + " ");
			}
			
			System.out.println();
			
		}
		
	}
	
	public void TwoDArrayTravColMajor() {
		
		//Traverse going top to bottom
		
		String [][] nameGrid = { 
				{"Bob","Tom","John","James"},
				{"Mary","Jimmy","Mark","Ralph"},
				{"Tim","Hugh","Apple","Greg"}
				}; 
		
		
		for (int col=0; col<nameGrid[0].length;col++) {
			
			
			for (int row = 0; row<nameGrid.length;row++) {
				
				//Always [row][col] to access
				System.out.print(nameGrid[row][col] + " ");
			}
			
			System.out.println();
			
		}
		
		
	}
	
	public boolean TwoDArraySearch(String[][] input2DArray, String lookingFor) {
		
		for (int row=0; row<input2DArray.length;row++) {
			
			for (int col = 0; col<input2DArray[0].length;col++) {
				
				if(input2DArray[row][col].equals(lookingFor)) {
					return true;
				}
			}
			
		}
		return false;
		
		//How would I do it with enhanced loops?
		
	}
	
	public String findLongest(String[][] input2DArray) {
		
		String longest = input2DArray[0][0];
		
		for(String[] row:input2DArray) {
			
			for(String item:row) {
				
				if(item.length()>longest.length()) {
					longest = item;
				}
			}
		}
		return longest;
	}
	
//	public double percentBiggerThan2(int[][] input2DArray) {
//		
//		
//	}

}
