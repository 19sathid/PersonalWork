package decisions;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your test average, homework average");
		double test = input.nextDouble();
		double homework = input.nextDouble();
		System.out.println("Is your teacher nice");
		boolean nice = input.nextBoolean();
		if (nice == true) {
			if (test > homework) {
				System.out.println("Grade:" + test);
			} else {
				System.out.println("Grade:" + homework);
			}
		} else {
			if (test < homework) {
				System.out.println("Grade:" + test);
			}
		}
		if (homework < test) {
			System.out.println("Grade:" + homework);
		}

	}

}
