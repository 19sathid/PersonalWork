package decisions;

import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		int largest = 0;
		int smallest = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter test score");
		score = input.nextInt();
		largest = score;
		smallest = score;
		do{
			if (score > largest) 
		largest = score;
		if(score < smallest)
			smallest = score;
		System.out.println("Enter test score(Enter 9999 to quit)");
		score = input.nextInt();
		}while (score != 9999);
			System.out.println("Largest: " + largest);
			System.out.println("Smallest: " + smallest);
		}
}


