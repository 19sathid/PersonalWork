package arrays;

import java.util.Scanner;

public class SsnBreakdown {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int employeeNum = 3;
		String ssn = " ";
		double[] sum = new double[employeeNum];
		double largest = 0;
		double smallest = 19;
		double sumOfDigits = 0;
		String middleDigits = " ";
		for (int i = 0; i < employeeNum; i++) {
			System.out.println("Enter the ssn of an employee(###_##_####)");
			ssn = input.nextLine();
			System.out.println(ssn);
			middleDigits = ssn.substring(4, 6);
			System.out.println(middleDigits);
			sum[i] = middleDigits.charAt(0) + middleDigits.charAt(1);
			System.out.println(sum[i]);
		}
		/*	if (sum[i] > largest) {
				largest = sum[i];
			}
			if (sum[i] < smallest) {
				smallest = sum[i];
			}
		}
	*/
		double average = sumOfDigits / 10;
	//	System.out.println("The largest sum of middle digit is " + largest);
	//	System.out.println("The smallest sum of middle digit is " + smallest);
	//	System.out.println("The average sum of middle digit is " + average);
		input.close();
	}

}
