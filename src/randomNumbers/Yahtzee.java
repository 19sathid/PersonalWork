package randomNumbers;

import java.util.Random;

public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 1;
		int max = 6;
		int roll = 0;
		int count = 0;
		int tries = 0;
		boolean yahtzee = false;
		while (yahtzee == false) {
			for (int i = 1; i < 5; i++) {
				int outcome = min + generator.nextInt(max - min + 1);
				if (roll == 0) {
					roll = outcome;
					count++;
				} else if (outcome == roll) {
					count++;
				}
				System.out.println(outcome);
			}
			if (count == 5) {
				System.out.println("You got Yahtzee! It took you " + tries + " tries!");
				yahtzee = true;
			} else {
				yahtzee = false;
				tries++;				
			}
			count = 0;
		}
	}
}
