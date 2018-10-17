package decisions;

import java.util.Scanner;

public class PetsandGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of pets in your house");
		int pets = input.nextInt();
		System.out.println("Enter the number of cars that will fit in your garage");
		int cars = input.nextInt();
		System.out.println(pets >= 5 || cars > 3);
	}

}
