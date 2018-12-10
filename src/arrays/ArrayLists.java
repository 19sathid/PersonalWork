package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> xNames = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++){
			System.out.println("Enter a name");
			String name = input.nextLine();
			names.add(name);
		}
		for(int i = 0; i < 3; i++){
			System.out.println(names.get(i));
		}
		
		xNames.add("Bob");
		xNames.add("Jane");
		xNames.add(0, "Billy");
		
		for(int i = 0; i < 3; i++){
			System.out.println(names.get(i));
		}
		
		for(int i = 0; i < 3; i++){
		System.out.println("Enter your name");
		String yourName = input.nextLine();
		names.add(yourName);
		}
		
		
		input.close();
	}

}
