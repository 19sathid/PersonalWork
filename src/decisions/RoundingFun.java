package decisions;

import java.util.Scanner;

public class RoundingFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a four number");
		num = input.nextInt();
		while (num != 9999) {
			if ((num % 100) < 50) {
				num = num - (num % 100);
			} else {
				num = num + (num % 100);
			}
			System.out.println(num);
			System.out.println("Enter a four digit number(Enter 9999 to quit)");
			num = input.nextInt();
		}
	}

}
