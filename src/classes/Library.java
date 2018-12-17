package classes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Library {
	private String name;
	private ArrayList<Book> books;

	public Library() {
		name = "Brookfield Public Library";
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the name of the book");
			String title = input.nextLine();
			int numPages = 10 + rand.nextInt(491);
			books.add(new Book(title, numPages));
		}
	}
public Library(String xName, ArrayList<Book> xBook){
	}
}
