package objectorientedprogramming;

import java.util.Scanner;

public class HomeImprovementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double length = -999.9;
		double height = -999.9;
		Scanner input = new Scanner(System.in);
		HomeImprovement myHouse = new HomeImprovement();
		System.out.println("Length of the room:");
		length = input.nextDouble();
		System.out.println("Height of the room:");
		height = input.nextDouble();
		myHouse.paintWall(length, height);
		System.out.println("Length of the garden:");
		length = input.nextDouble();
		System.out.println("Number of rows in the garden:");
		int rows = input.nextInt();
		myHouse.plantGarden();
	}

}
