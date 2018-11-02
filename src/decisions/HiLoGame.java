package decisions;

import java.util.Scanner;

public class HiLoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Pick a number from 0 to 1000");
		int random = input.nextInt();
		int attempts = 0;
		while (random != 150) {
			while (random >= 180) {
				System.out.println("The number you have guessed is too large");
				attempts++;
				System.out.println("Pick a number from 0 to 1000");
				random = input.nextInt();
			}
			while(random <= 120) {
				System.out.println("The number you have guessed is too small");
				attempts++;
				System.out.println("Pick a number from 0 to 1000");
				random = input.nextInt();
			}
			while((random > 120)&&(random < 180)&&(random != 150)) {
				System.out.println("Close");
				attempts++;
				System.out.println("Pick a number from 0 to 1000");
				random = input.nextInt();
			}
		}
		System.out.println("The number you guessed is right");
		System.out.println("Number of attempts: "+ attempts);
	}

}
