package classes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Library {
	private String name;
	private ArrayList<Book> fiction;

	Scanner input = new Scanner(System.in);
	Random rand = new Random();

	public Library() {
		name = "Brookfield Public Library";

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the name of the book");
			String title = input.nextLine();
			int numPages = 10 + rand.nextInt(491);
			fiction.add(new Book(title, numPages));
		}
	}

	public Library(String xName, ArrayList<Book> xFiction) {
		name = xName;
		fiction = xFiction;
	}

	public void checkOut(String name) {
		System.out.println("Enter the name of the book you want to check out");
		String book = input.nextLine();
		int numPages = 10 + rand.nextInt(491);
		fiction.remove(new Book(book, numPages));
	}

	public void returnBook(String name) {
		System.out.println("Enter the name of the book you want to return");
		String book = input.nextLine();
		int numPages = 10 + rand.nextInt(491);
		fiction.add(new Book(book, numPages));
	}

	public void fire() {
		fiction.clear();
	}

}
