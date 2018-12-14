package classes;

import java.util.Scanner;

public class PileOJunkTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PileOJunk bob = new PileOJunk();
		System.out.println("Enter an integer");
		int x = input.nextInt();
		System.out.println("Enter an integer");
		int y = input.nextInt();
		System.out.println("Sum: " + bob.sum(x, y));

	}

}
