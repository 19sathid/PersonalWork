package Strings;

public class TestEssay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Essay book = new Essay();
		book.setName("Divya Sathiyamoorthy");
		book.setText("Hello World");
		System.out.println("Author's Last Name: " + book.getLastName());
		System.out.println("There are " + book.getFirstName() + " characters in the author's first name.");
		System.out.println("Does the author's name contain 'X'? : " + book.findX());
		System.out.println("Number of words in the essay: " + book.numWords());
	}

}
