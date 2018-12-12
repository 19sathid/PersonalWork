package arrays;

import java.util.Random;

public class Activityfor2D {

	public static void main(String[] args) {
		Random rand = new Random();
		int rows = 3;
		int columns = 7;
		int[][] integers = new int[rows][columns];
		int sum = 0;

		for (int r = 0; r < integers.length; r++) {
			for (int c = 0; c < integers[0].length; c++) {
				integers[r][c] = rand.nextInt(101);
				sum += integers[r][c];
				System.out.print(integers[r][c] + "   ");
			}
			System.out.println(" ");
		}
		System.out.println("The sum of the elements is " + sum);
	}

}
