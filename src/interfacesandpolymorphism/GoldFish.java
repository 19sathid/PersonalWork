package interfacesandpolymorphism;

public class GoldFish implements Fish {
	private double length;
	private int age;
	private String color;

	public GoldFish(double l, int a, String c) {
		length = l;
		age = a;
		color = c;
	}

	public double getLength() {
		return length;
	}

	public String toString() {
		return ("GoldFish's length : " + length + ", age : " + age + ", color : " + color);
	}
}
