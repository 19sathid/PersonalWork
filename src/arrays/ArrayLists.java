package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Friend> buddies = new ArrayList<Friend>();
		Scanner input = new Scanner(System.in);

		names.add("Bob");
		names.add("Jane");
		names.add(0, "Billy");
		System.out.println("Enter your name");
		names.add(input.nextLine());
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println(names);

		Friend person = new Friend("Jacki Jones", 93);
		buddies.add(person);
		buddies.add(0, new Friend("John Smith", 45));
		System.out.println("Enter a name");
		String name = input.nextLine();
		System.out.println("Enter an age");
		int age = input.nextInt();
		Friend user = new Friend(name, age);
		buddies.add(0, user);
		System.out.println("Ages of Friends:");
		for (int j = 0; j < buddies.size(); j++) {
			System.out.println(buddies.get(j).getAge());
		}

		input.close();
	}

}
