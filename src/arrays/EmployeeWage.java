package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeWage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> wages = new ArrayList<Double>();
		System.out.println("Enter the number of employees");
		int num = input.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("Enter the wage of each employee");
			wages.add(input.nextDouble());
		}
		double highest = 0;
		for (Double worker : wages) {
			if (worker > highest) {
				highest = worker;
			}

		}
	}

}
