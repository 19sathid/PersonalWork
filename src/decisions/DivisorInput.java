package decisions;

import java.util.Scanner;

public class DivisorInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int integer = input.nextInt();
		int largest = 0;
		int number = 0;
		int num = 0;
		for (int counter = 1; counter < integer; counter++) {
			for (number = 1; number < integer; number++) {
				if (number % counter == 0) {
					num++;
				}
			}
		}
		if (num > largest) {
			largest = num;
		}
		num = 0;
		System.out.println(number);
	}

}
