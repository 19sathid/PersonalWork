package inputExamples;
import java.util.Scanner;
public class songLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double number = -999.0;
double length = -999.0;
double average = -999.0;
System.out.println("Enter the number of songs and the total length in minutes and seconds");
number = input.nextDouble();
length = input.nextDouble();
length = length*100;
average = length/number;
average = average/100;
System.out.println("The average song length is " + (int)average + " minutes and " + (int)((average-(int)average)*100) + " seconds");
	
input.close();}

}
