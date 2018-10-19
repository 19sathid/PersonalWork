package decisions;

import java.util.Scanner;

public class CutGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length and width of the front yard");
		double length = input.nextDouble();
		double width = input.nextDouble();
		double area = length * width;
		double amount = (area / 100) * 1;
		System.out.println("Did you cut the back yard?");
		boolean backyard = input.nextBoolean();
		if (backyard == true) {
			System.out.println("Enter the radius of the circle");
			double radius = input.nextDouble();
			double arCircle = Math.PI * radius * radius;
			double backAmount = (arCircle/75)*1.50;
			double totAmount = amount + backAmount;
			System.out.println("Amount paid:" + totAmount);
		} else {
			System.out.println("Amount paid:" + amount);
		}
	}

}
