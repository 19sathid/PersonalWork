package inputExamples;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int fine1 = 55;
final int fine2 = 40;
int totalfine = 0;
int limit = -999;
int speed = -999;
int difference = -999;
Scanner input = new Scanner(System.in);
System.out.println("Enter the your speed and the speed limit");
speed = input.nextInt();
limit = input.nextInt();
difference = speed - limit;
totalfine = 55 + (difference - 1)*40;
System.out.println("You have to pay $ " + totalfine);
	}

}
