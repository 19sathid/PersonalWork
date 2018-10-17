package objectorientedprogramming;

public class CarClass {
//instance fields
	private double mPG;
	private double capacity;
	private double fuel;
	private double odometer;

//constructors
	public CarClass() {
		mPG = 20;
		capacity = 20;
		fuel = 20;
		odometer = 0;
	}

	public CarClass(double newMPG, double newCapacity, double newFuel, double newOdometer) {
		mPG = newMPG;
		capacity = newCapacity;
		fuel = newFuel;
		odometer = newOdometer;
	}

	// Mutator methods
	public void setFuel(double newFuel) {
		fuel = newFuel;
	}

	// Accessor methods
	public double getMPG() {
		return mPG;
	}

	public double getFuel() {
		return fuel;
	}
	
	public double milesdriven() {
		return odometer + (fuel*mPG);
	}
}
