package classes;

import java.util.Random;

public class Employee {
	private String name;
	private double rate;
	private double[] hoursWorked;
	private static int employeeClassNum = 0;
	private int employeeNumber;

	public Employee() {
		name = "John Smith";
		rate = 10;
		Random rand = new Random();
		hoursWorked = new double[52];
		for (int i = 0; i < hoursWorked.length; i++) {
			int num = rand.nextInt(41);
			hoursWorked[i] = (double) num;
		}
		
	}

}
