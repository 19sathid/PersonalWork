package inheritance;

public class Worker extends Employee {
	private double years;

	public Worker() {
		super();
		years = 3;
	}

	public Worker(String n, double r, double y) {
		super(n, r);
		years = y;
	}

	public double CalculatePay(double hours, double num) {
		double pay = super.getRateOfPay() * hours;
		if (num > 10) {
			double bonus = 0.2 * pay;
			return (pay + bonus);
		} else {
			return pay;
		}
	}

	public String toString() {
		return ("Worker : Years : " + years + super.toString());
	}
}
