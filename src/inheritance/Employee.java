package inheritance;

public class Employee {
	private String name;
	private double rateOfPay;

	public Employee() {
		name = "Bob Smith";
		rateOfPay = 10;
	}

	public Employee(String x, double r) {
		name = x;
		rateOfPay = r;
	}

	public double CalculatePay(double hours) {
		return rateOfPay * hours;
	}

	public double getRateOfPay() {
		return rateOfPay;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return ("Employee : Name : " + name + " , rate of pay : " + rateOfPay);
	}

	public boolean equals(Employee user) {
		return (this.toString().equals(user.toString()));
	}
}
