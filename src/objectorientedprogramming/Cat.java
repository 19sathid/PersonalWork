package objectorientedprogramming;

public class Cat {
	// instance fields
	private int age;
	private double sleep;

	// constructors
	public Cat() {
		age = -999;
		sleep = -999.0;
	}

	// Accessor Methods
	public int getAge() {
		return age;
	}

	public double getSleep() {
		return sleep;
	}

	public double getBirthday() {
		return age + 1;
	}

	// Mutator methods
	public void setAge(int newAge) {
		age = newAge;
	}

	public void setsleepMore(double newSleep) {
		sleep = newSleep + 1;
	}

	public void setsleepLess(double newSleep) {
		sleep = newSleep - 1;
	}
}