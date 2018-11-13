package decisions;

import java.util.Scanner;

public class HeightandShoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your height and shoe size");
		double height = input.nextDouble();
		int shoesize = input.nextInt();
		System.out.println(height < 62 && shoesize > 9);
	}

}
