package classes;

import java.util.Scanner;
import java.util.ArrayList;

public class ClassActivities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Greeter> greeters = new ArrayList<Greeter>();

		Greeter bob = new Greeter();
		Greeter tina = new Greeter(24);

		System.out.println("Bob's age: " + bob.getAge());
		System.out.println("Tina's age: " + tina.getAge());

		System.out.println("Enter the number of greeters requires");
		int num = input.nextInt();

		for (int i = 0; i < num; i++) {
			greeters.add(new Greeter());
		}

		for (Greeter bill : greeters) {
			System.out.println("Age :" + bill.getAge());
		}

	}
}
