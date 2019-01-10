package interfacesandpolymorphism;

public class Trout implements Fish{
	private double length;
	private int age;
	private double numScales;

	public Trout(double l, int a, double n) {
		length = l;
		age = a;
		numScales = n;
	}

	public double getLength() {
		return length;
	}

	public String toString() {
		return ("Fish's length : " + length + ", age : " + age + ", numScales : " + numScales);
	}
}
