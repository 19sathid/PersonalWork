package classes;

import java.util.ArrayList;
import java.util.Random;

public class Library {
	private String name;
	private ArrayList<Book> fiction;

	public Library() {
		name = "Brookfield Public Library";

		for (int i = 0; i < 10; i++) {
			String title = "The Selection";
			Random rand = new Random();
			int numPages = 10 + rand.nextInt(491);
			fiction.add(new Book(title, numPages));
		}
	}

	public Library(String xName, ArrayList<Book> xFiction) {
		name = xName;
		fiction = xFiction;
	}

	public void checkOut(int index) {
		fiction.remove(index);
	}

	public void returnBook(String xName, int xNumPages) {
		fiction.add(new Book(xName, xNumPages));
	}

	public void fire() {
		fiction.clear();
	}

}
