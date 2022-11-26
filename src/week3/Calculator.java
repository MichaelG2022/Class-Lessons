package week3;

public class Calculator {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		double cost = 1000;
		double tax = c.calculateTax(cost);
		System.out.println("Total cost = $" + (cost + tax));		
		
	} // end MAIN		
	
	public static double calculateTax(double cost) {
		double tax = cost * 7.25/100;
		return tax;
	} // end calculateTax
	

} // end CLASS
