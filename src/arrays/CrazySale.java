package arrays;

import java.util.Random;
import java.util.Scanner;

public class CrazySale {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random percent = new Random();
		int min = 0;
		int max = 100;
		double[] discount = new double[25];
		double[] cost = new double[25];
		double[] newCost = new double[25];
		for (int i = 0; i < cost.length; i++) {
			System.out.println("Enter the cost of an item");
			cost[i] = input.nextDouble();
			discount[i] = min + percent.nextInt(max + min - 1);
			newCost[i] = cost[i] - ((discount[i] / 100) * cost[i]);
			System.out.println("The new cost of the item is " + newCost[i]);
		}

		input.close();
	}

}
