package week5;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();				// This broke when we made Vehicle abstract - can't instantiate an abstract class
		
		// Without encapsulation, anyone can use the following to change data about a Vehicle object
		// v.color = "Red";
		// v.year = 2015;
		
		// This is how it should be done properly for encapsulation
		v.setColor("Red");
		v.setYear(2015);
		
		Vehicle v1 = new Vehicle();		
		System.out.println(v.getMileage());			// The method getMileage is abstracted from Vehicle to hide it from the user.The internal complexity of how
														// to calculate mileage is abstracted from the user.
		
		Car c = new Car();
		c.stop();
		
		Vehicle v2 = new Car();
		
		Vehicle b = new Bike();
		b.setType("bike");
		
		c.drive();
		
		Vehicle p = new PedalBike();
		
		
		

	} // end MAIN

} // end CLASS
