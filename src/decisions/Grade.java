package decisions;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first test score:");
		double first = input.nextDouble();
		System.out.println("Enter your second test score:");
		double second = input.nextDouble();
		System.out.println("Enter your third test score:");
		double third = input.nextDouble();
		System.out.println("Enter the total points");
		int total = input.nextInt();
		System.out.println("Did you do the extra credit?");
		boolean extra = input.nextBoolean();
		if(extra == true){
			System.out.println("Enter the number of points earned for extra credit:");
		double points = input.nextDouble();
		System.out.println("Grade:" + ((first+second+third)%3)+points);
		}
		System.out.println("Grade:" + ((first+second+third)%(3*total))*100 + "%"); 
	}

}
