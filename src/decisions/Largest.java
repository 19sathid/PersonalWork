package decisions;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int first = input.nextInt();
		System.out.println("Enter the second integer:");
		int second = input.nextInt();
		System.out.println("Enter the third integer:");
		int third = input.nextInt();
		if (first > second && first > third) {
			System.out.println("Largest integer:" + first);
		}
		if (second > first && second > third) {
			System.out.println("Largest integer:" + second);
		}
		if (third > first && third > second) {
			System.out.println("Largest integer:" + third);
		}
	}

}
