package decisions;

import java.util.Scanner;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int largest = 0;
		int smallest = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		number = input.nextInt();
		largest = number;
		smallest = number;
		do {
			if (number > largest)
				largest = number;
			if (number < smallest)
				smallest = number;
			System.out.println("Enter a an integer(Enter 9999 to quit)");
			number = input.nextInt();
		} while (number != 9999);
		System.out.println("Range:" + (largest - smallest));

	}

}
