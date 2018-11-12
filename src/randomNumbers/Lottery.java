package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("Winning Lottery Number 1: ");
		int win1 = input.nextInt();
		System.out.println("Winning Lottery Number 2: ");
		int win2 = input.nextInt();
		System.out.println("Winning Lottery Number 3: ");
		int win3 = input.nextInt();
		System.out.println("Winning Lottery Number 4: ");
		int win4 = input.nextInt();
		System.out.println("Min number: ");
		int min = input.nextInt();
		while (min < 0) {
			System.out.println("Min number: ");
			min = input.nextInt();
		}
		System.out.println("Max number: ");
		int max = input.nextInt();
		while (max < min) {
			System.out.println("Max number: ");
			max = input.nextInt();
		}
		int guess = min + generator.nextInt(max - min + 1);
		int tries = 1;
		while (guess != win1 || guess != win2 || guess != win3 || guess != win4) {
			guess = min + generator.nextInt(max - min + 1);
			tries++;
		}
		System.out.println("It took " + tries + " try/tries to get a winning number!");
		input.close();
	}

}
