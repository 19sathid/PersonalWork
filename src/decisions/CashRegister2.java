package decisions;

import java.util.Scanner;

public class CashRegister2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of items");
		int number = input.nextInt();
		double price = 0;
		double cost = 0;
		double totalcost = 0;
		double totaltax = 0;
		for (int counter = 1; counter <= number; counter++) {
			System.out.println("Enter the price of each item");
			price = input.nextDouble();
			cost = cost + price;
			totaltax = 0.05 * cost;
			totalcost = cost + totaltax;
		}
		System.out.println("Total cost of items: " + cost);
		System.out.println("Cost of tax: " + totaltax);
		System.out.println("Total cost of items including tax: " + totalcost);
	}

}
