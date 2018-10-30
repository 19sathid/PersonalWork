package decisions;

import java.util.Scanner;

public class SumofOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = input.nextInt();
		for (int counter = 1; counter < number; counter = counter + 2) {
			total += counter;
		}
		System.out.println(total);
	}

}
