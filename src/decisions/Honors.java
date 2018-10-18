package decisions;

import java.util.Scanner;

public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your GPA");
		double gpa = input.nextDouble();
		System.out.println("Enter your grade level");
		int gradelevel = input.nextInt();
		if (gpa >= 3.5 && gradelevel == 12) {
			System.out.println("You are eligible to graduate with honors");
		} 
		else {
			System.out.println("You are not eligible to graduate with honors");
		}

	}

}
