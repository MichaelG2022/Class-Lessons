package week3;

public class Week3Class {

	public static void main(String[] args) {
		String[] students = new String[10];
		
		//arrays cannot be resized
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		} // end FOR
		System.out.println(students.length);
		
		int[] b = new int[100];
		// new is usually required to declare a new instantiation of an object
		
		String[] a = new String[] {"a","b","c"};
		
		//enhanced for loop
		for(String s : a) {
			System.out.println(s);
		}
		
//2-dimensional arrays
		int c[][] = new int[3][3];
		/*
		 * [0,0][0,1][0,2]
		 * [1,0][1,1][1,2]
		 * [2,0][2,1][2,2]
		 */
		
		for (int i= 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(c[i][j]);
			} // end nested FOR  		
		} // end FOR
		
// METHODS
		// allows code to be reused - named with verbs/actions
		// attributes are nouns
		
		
		
		
	} // end MAIN

} // end CLASS
