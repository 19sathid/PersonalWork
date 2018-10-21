package decisions;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the outside temperature:");
		double temp = input.nextDouble();
		if (temp > 83) {
			System.out.println("Swimming");
		}
		if ((temp > 74) && (temp <= 83)) {
			System.out.println("Tennis");
		}
		if ((temp > 35) && (temp <= 74)) {
			System.out.println("Golf");
		}
		if ((temp > -10) && (temp <= 35)) {
			System.out.println("Snow Shoeing");
		}
		if (temp <= -10) {
			System.out.println("Nothing");
		}
	}
}
