package week2;

import java.util.Scanner;

public class Week2Class {

	public static void main(String[] args) {
		
		// Allowing user to set the step value for the iteration
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the counter value ");
		
		int counterInput = sc.nextInt();
		
		// cannot cause an infinite loop;
		for (int i = 7;  i < 100; i+=counterInput) {
			// called scope or block of code
			System.out.println(i);
		} // end FOR
		
		// can cause an infinite loop
//		int i = 0;
//		while (i < 100) {
//			System.out.println(i);
//			i++;
//		} // end WHILE
		

// Testing for prime numbers - needs work
		boolean flag = false;
		int inputNumber = 359;
		
		
		
		for (int i = 2; i < inputNumber; i ++) {			// for (int i = 2; i < inputNumber/2+1; i ++)should work with 1 more than half
			if(inputNumber % i == 0) {								// of the inputNumber iterations
				flag = true;
			} // end IF
		} // end FOR	
			
			if (flag) {
				System.out.println("Not a prime");
			} else {
				System.out.println("Prime");
			}			
			
	
		// Averaging numbers - had to use doubles because of the size of the numbers
//		float topNumber = 100;
//		float sum = 0;
//		
//		for (int i = 1; i <= topNumber; i ++) {
//			sum = sum + i;
//		}
//		 System.out.println(sum/topNumber);
		
		
	} // end MAIN
		
} // end CLASS
