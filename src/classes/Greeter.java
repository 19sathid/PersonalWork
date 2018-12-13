package classes;

public class Greeter {
	private int age;

	public Greeter() {
		age = 17;
	}

	public Greeter(int xAge) {
		age = xAge;
	}

	public void sayHello() {
		System.out.println("Hello");
	}

	public int getAge() {
		return age;
	}

}
