package Strings;

public class Essay {
	private String text;
	private String name;

	public Essay() {
		name = "Bob";
		text = "Essay";
	}

	public void setText(String newText) {
		text = newText;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getLastName() {
		int space = name.indexOf(' ');
		String lastName = name.substring(space + 1, name.length());
		return lastName.toUpperCase();
	}

	public int getFirstName() {
		int space = name.indexOf(' ');
		String firstName = name.substring(0, space - 1);
		int length = firstName.length();
		return length;
	}

	public boolean findX() {
		int xIndex = name.indexOf('X');
		boolean xInName;
		if (xIndex == -1) {
			xInName = false;
		} else {
			xInName = true;
		}
		return xInName;
	}

	public int numWords() {
		int words = 0;
		int spaces = 0;
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == ' ') {
				spaces++;
			}
		}
		words = spaces + 1;
		return words;
	}
}
