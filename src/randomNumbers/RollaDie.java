package randomNumbers;
import java.util.Random;
import java.util.Scanner;
public class RollaDie {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("Enter the number of sides in the die");
		int sides = input.nextInt();
		if(sides<0){
			sides=1;
		}
		System.out.println("Number of rolls");
		int rolls = input.nextInt();
		int randomNum = 0;
		int min = 1;
		int max = sides;
		for(int i = 0; i<rolls; i++){
			randomNum = min + generator.nextInt(max - min + 1);
			System.out.println(randomNum);
		}
	}
}
