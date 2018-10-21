package decisions;

import java.util.Scanner;

public class RescuethePeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of people to be rescued:");
		int people = input.nextInt();
		System.out.println("Number of helicopters:" + people / 10);
		if (people % 10 == 0) {
			System.out.println("Mission was a success");
		} else {
			System.out.println("Number of deaths:" + people % 10);
		}
	}

}
