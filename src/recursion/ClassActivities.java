package recursion;
import java.util.Scanner;
public class ClassActivities {
	public static int sumNumbers(int num) {
		int sum = 0;
		if (num > 0) {
			sum += num;
			return (num + sumNumbers(num - 1));
		}
		return num;
	}	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int integer = input.nextInt();
		System.out.println(sumNumbers(integer));
	}
}


