
public class Unit8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("----------------------");
		
		Unit8_1Arrays2D twoDArrays = new Unit8_1Arrays2D();
		
		twoDArrays.TwoDArrayMethods();
		
		Unit8_2Arrays2DTraversal twoDTrav = new Unit8_2Arrays2DTraversal();
		
		// twoDTrav.TwoDArrayTravFor();
		
		// twoDTrav.TwoDArrayTravEnhanced();
		
		// twoDTrav.TwoDArrayTravRowMajor();
		
		// twoDTrav.TwoDArrayTravColMajor();

		 
		 
		String[][] fruits = {{"Apple","Bannana","Melon","Strawb"},
							 {"Cherry","Blueberry","Clementine","Coconut"},
							 {"Orange","Grapefruit","Mango","Mamey"}};
		
		boolean isItThere = twoDTrav.TwoDArraySearch(fruits, "Mango");
	// System.out.println(isItThere);
//		
		// System.out.println(twoDTrav.findLongest(fruits));
		
		
		
		
		int[][] someNumbers = {{1,2,3,4,1},{2,4,1,0,4},{2,3,1,1,1},{3,5,6,2,3}};
		
		//System.out.println(twoDTrav.percentBiggerThan2(someNumbers));



        System.out.println("----------------------");

		
	}	

}