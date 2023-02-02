
import java.util.ArrayList;
import java.util.List;


public class Unit8_1Arrays2D {
	
	public void TwoDArrayMethods() {
		
		//2D Array is an array of arrays
		
		//regular - 1D
		
		String [] Students = {"Bob","Tom","John","Mary","Jimmy","Mark"};
		
		int [] gradesT1 = {85,90,95};
		int [] gradesT2 = {98,78,88};
		int [] gradesT3 = {78,88,98,99};
		
		//new int [columns]
		int [] listOfInts  = new int[5];

        // ArrayList<Integer> a1 =  new ArrayList<Integer>();
		// // System.out.println(a1.size());
		
		// //.add(x) appends element to the end of the arraylist
		// a1.add(24);
		// a1.add(267);
		// a1.add(15);
		// a1.add(456);
		// a1.add(789);
		
		// 2D
		
		String [][] seatingChart = { 
				Students,
				{"Mary","Jimmy","Mark"}
				}; 
		
		
		int [][] allGrades = {gradesT1,
							  gradesT2,
							  gradesT3};
		
		//new int [rows][columns]
		int [][] listOfInts2D = new int[4][10];


		
		//Sizes of 2D Arrays
		
		//number of rows given by .length
		// System.out.println("Number of rows in allGrades: "+allGrades.length);
		// System.out.println("Number of rows in seatingChart: "+seatingChart.length);
		
		//number of columns given by length of first row.
		// System.out.println("Number of columns in allGrades: "+allGrades[1].length);
		// System.out.println("Number of columns in seatingChart: "+seatingChart[0].length);
		
		
		//Getting the elements in 2D Arrays
		//[row][column]
		
		//remember index start at 0 for both rows and columns (first row has index of 0)
		
		// System.out.println("first row, second column in allGrades: "+allGrades[0][1]);
		// System.out.println("second row, third column in seatingChart: "+seatingChart[1][2]);
		
		//getting the first thing [0][0]
		System.out.println("first row, first column in allGrades: "+allGrades[0][0]);
		//getting the last thing [allGrades.length-1][allGrades[0].length-1] (remember last index value is length-1)
		System.out.println("last row, last column in allGrades: "+allGrades[allGrades.length-1][allGrades[allGrades.length-1].length-1]);
		
		//change stuff
		allGrades[0][1] = 100;
		
        // int [] gradesT1 = {85,90,95};
		// int [] gradesT2 = {98,78,88};
		// int [] gradesT3 = {78,88,98,99};
		
		allGrades[allGrades.length-1][allGrades[0].length-1] = allGrades[allGrades.length-1][allGrades[0].length-1]+1;
		
		
		
		//John and Mark Switch seats?
		
		
		
		
	}

}