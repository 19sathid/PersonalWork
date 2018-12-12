package arrays;

import java.util.Scanner;

public class ForEachLoopActivity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the number of students in class");
		int num = input.nextInt();

		int[] ages = new int[num];

		for (int i = 0; i < ages.length; i++) {
			System.out.println("Enter the age of each student");
			ages[i] = input.nextInt();
		}

		int sum = 0;
		for (int y : ages) {
			sum += y;
		}
		System.out.println("Average of ages :" + ((double) sum / ages.length));
	}

}
