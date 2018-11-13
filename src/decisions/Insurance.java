package decisions;

import java.util.Scanner;

public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = input.nextInt();
		System.out.println("Enter your weight");
		double weight = input.nextDouble();
		System.out.println("Do you smoke");
		boolean smoke = input.nextBoolean();
		double insurance = 200;
		if (age > 75) {
			insurance = insurance + 125;
		}
		if (age < 30) {
			insurance = insurance - 25;
		}
		if (weight > 700) {
			insurance = insurance + 300;
		}
		if (smoke == true) {
			insurance = insurance + 50;
		}
		else{
			insurance = insurance - 40;
		}
		System.out.println("Total Insurance:" + insurance);
	}

}
