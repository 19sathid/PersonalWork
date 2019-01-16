package inheritance;

public class Manager extends Employee {
	private int level;

	public Manager() {
		super();
		level = 2;
	}

	public Manager(String n, double r, int l) {
		super(n, r);
		level = l;
	}

	public double calculatePay(double hours) {
		double pay = super.getRateOfPay() * hours;
		double bonus = level / 100;
		return (pay + bonus);
	}

	public Manager clone() {
		return new Manager(super.getName(), super.getRateOfPay(), level);
	}
}
