package decisions;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int multiples = 0;
System.out.println("Enter endpoint");
int endpoint = input.nextInt();
while(multiples <= endpoint){
	sum+= multiples;
	multiples+= 2;
}
	System.out.println(sum);
	}

}
