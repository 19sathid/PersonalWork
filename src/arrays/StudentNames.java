package arrays;

import java.util.ArrayList;

public class StudentNames {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();

		students.add("Jane");
		students.add("Jack");
		students.add("Tina");

//remove the first student
		if (students.size() > 0) {
			students.remove(0);
		}
		if (students.size() > 0) {
			students.remove(students.size() - 1);
		}
		System.out.println("The remaining student names are:");
		for (int j = 0; j < students.size(); j++) {
			System.out.println(students.get(j));
		}
	}

}
