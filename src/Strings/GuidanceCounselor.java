package Strings;
import java.util.Scanner;
public class GuidanceCounselor {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String str = "quit";
		String counselor1 = "";
		String counselor2 = "";
		String counselor3 = "";
		String counselor4 = "";
		System.out.println("Enter the last names of the students in your school");
		String lastName = input.nextLine();
		char firstLetter = lastName.charAt(0);
		char secondLetter = lastName.charAt(1);
		while(!(lastName.equals(str))) {
			firstLetter = lastName.charAt(0);
			secondLetter = lastName.charAt(1);
			if(firstLetter >= 'A' && firstLetter <= 'G') {
				String counselor = "Mr. Williams";
				counselor1 = counselor1 + " " + lastName;
			}
			if(firstLetter >= 'H' && firstLetter <= 'N') {
				String counselor = "Mrs. Smith";
				counselor2 = counselor2 + " " + lastName;
			}
			if((firstLetter >= 'O') && (firstLetter <= 'S' && secondLetter <= 't')) {
				String counselor = "Mrs. Johnson";
				counselor3 = counselor3 + " " + lastName;
			}
			if((firstLetter >= 'S' && secondLetter > 't') && (firstLetter <= 'Z')) {
				String counselor = "Mr. Bond";
				counselor4 = counselor4 + " " + lastName;
			}
		System.out.println("Enter the last names of the students in your school (Enter quit when done)");
		lastName = input.nextLine();
		}
		System.out.println("Mr. Williams : " + counselor1);
		System.out.println("Mrs. Smith : " + counselor2);
		System.out.println("Mrs. Johnson : " + counselor3);
		System.out.println("Mr. Bond : " + counselor4);
	
	input.close();
	}
}