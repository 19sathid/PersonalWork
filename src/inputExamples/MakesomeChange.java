package inputExamples;
import java.util.Scanner;
public class MakesomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double amount = -999.0;
int change = -999;
int dollars = -999;
int quarters = -999;
int dimes = -999;
int nickels = -999;
int pennies = -999;
Scanner input = new Scanner(System.in);
System.out.println("Enter the amount");
amount = input.nextDouble();
amount = amount*100;
dollars = (int)amount/100;
change = (int)amount - (dollars*100) ;
quarters = (int)(change/25);
change = change - quarters*25;
dimes = (int)(change/10);
change = change - dimes*10;
nickels = (int)(change/5);
change = change - nickels*5;
pennies = change;
System.out.println("dollars = " + dollars);
System.out.println("Your change is ");
System.out.println("quarters = " + quarters);
System.out.println("dimes = " + dimes);
System.out.println("nickels = " + nickels);
System.out.println("pennies = " + pennies);

input.close();}

}