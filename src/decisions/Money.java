package decisions;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age and GPA");
		int age = input.nextInt();
		double gpa = input.nextDouble();
		if ((age + gpa) > 20) {
			System.out.println("Amount: $250");
		} else {
			System.out.println("Amount: $30");
		}
	}

}
