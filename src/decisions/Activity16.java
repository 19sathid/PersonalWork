package decisions;

import java.util.Scanner;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Number of times to write Hello");
		int stop = input.nextInt();
		for (int counter = 1; counter <= stop; counter++) {
			System.out.println(counter + " Hello");
		}
	}

}
