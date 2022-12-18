package week5;

public class Car extends Vehicle implements HybridVehicle, Auto {
	
	// extends means Car is a child of Vehicle
	// implements refers to interfaces

	@Override
	public void stop() {								// This is an example of inheritance
		System.out.println("Car is stopping");
	}
	
	public void drive() {
		System.out.println("I am driving");
	}

}
