package week5;

public class Vehicle {
	
	// This is part of encapsulation - these fields cannot be accessed outside the Class except by getters and setters so the data
		// of a Vehicle object cannot be modified except in a method we desire.
	// FIELDS
	private String color;
	private double price;
	private int year;
	private String type;
	private int mileage;
	
	// METHODS
	void drive() {
		System.out.println("I am driving");
	}
	
	public void stop() {
		System.out.println("Vehicle stopped");
	}
	
//	abstract void stop();				// this is an example of abstraction. "stop" can only be used in Vehicle. Car and Bike don't know how to stop.
											// Car and Bike would have to create their own stop method.
											// Because we made this an abstract method, the Class must also become abstract.
	
	
// GETTERS AND SETTERS - this is an example of encapsulation - also these are inherited into Bike and Car because of extending Vehicle with those classes	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMileage() {				// The method getMileage is abstracted from Vehicle to hide it from the user. The user doesn't need to 
												// know how we calculated the mileage.
		return 20;
	}
	
	
		
		
		
		
	
	
	
	

} // end CLASS
