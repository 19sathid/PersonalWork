package classes;

public class Book {
	private String title;
	private int numPages;

	public Book() {
		title = "Harry Potter";
		numPages = 300;
	}

	public Book(String xTitle, int xNum) {
		title = xTitle;
		numPages = xNum;
	}

	public String getTitle() {
		return title;
	}

	public int getPages() {
		return numPages;
	}
}
