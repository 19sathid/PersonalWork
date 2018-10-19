package decisions;

import java.util.Scanner;

public class Dimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to enter the dimensions in inches");
		boolean inches = input.nextBoolean();
		System.out.println("Enter the length of the rectangle");
		double length = input.nextDouble();
		System.out.println("Enter the breadth of the rectangle");
		double breadth = input.nextDouble();
		if (inches == true) {
			double area = length * breadth;
			System.out.println("Number of Post Its:" + area / 9);
		} else {
			double area = length * breadth;
			System.out.println("Number of Post Its:" + area / 0.0625);
		}

	}

}
