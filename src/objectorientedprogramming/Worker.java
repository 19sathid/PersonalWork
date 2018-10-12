package objectorientedprogramming;

public class Worker {
	// instance fields
	private int hours;
	private double pay;

	// constructors
	public Worker() {
		hours = 10;
		pay = 99.0;
	}

	public Worker(int newHours, double newPay) {
		hours = newHours;
		pay = newPay;
	}

	// Mutator methods
	public void setHours(int newHours) {
		hours = newHours;
	}
	public void setPay(double newPay) {
		pay = newPay;
	}

	// Accessor Methods
	public double getPay() {
		return pay + 10.0;
	}

	public double getHours() {
		return hours;
	}

	public double payCheck() {
		return hours * pay;
	}

}
