package objectorientedprogramming;

public class Cat {
//instance fields
	private int age;
	private double sleep;

//Mutator methods
	public void setAge(int newAge) {
		age = newAge;
	}

	public void sleepMore(double newSleep) {
		newSleep = sleep + 10.5;
	}

	public void sleepLess(double newSleep) {
		newSleep = sleep - 10.5;
	}
}