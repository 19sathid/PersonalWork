package arrays;

import java.util.Random;

public class ActivityforMorethan2D {

	public static void main(String[] args) {
		Random rand = new Random(3);
		int rows = 3;
		int columns = 7;
		int thirdDimension = 9;
		int[][][] elements = new int[rows][columns][thirdDimension];
		int sum = 0;
		
		
		for (int r = 0; r < elements.length; r++) {
			for (int c = 0; c < elements[0].length; c++) {
				for (int t = 0; t < elements[0][0].length; t++) {
					elements[r][c][t] = rand.nextInt(51);
					sum += elements[r][c][t];
				}

			}

		}
		System.out.println("The sum of the elements is " + sum);
	}

}
