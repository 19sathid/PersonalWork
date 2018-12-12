package arrays;

import java.util.Scanner;

public class AreaOfCircles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Circle[] radius = new Circle[10];

		for (int i = 0; i < radius.length; i++) {
			System.out.println("Enter the radius of a circle");
			radius[i] = new Circle(input.nextDouble());
		}

		for (Circle x : radius) {
			System.out.println(x.area());

		}

	}

}
