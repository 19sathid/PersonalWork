package objectorientedprogramming;

import java.util.Scanner;

public class CarClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		CarClass momsCar = new CarClass();
		System.out.println("Gallons of fuel:");

		CarClass dadsCar = new CarClass();
		System.out.println("Number of gallons in fuel tank:");
		System.out.println("Fuel efficiency:");
		System.out.println("Miles driven:" + dadsCar.milesdriven());
	}

}
