package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Algebra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Student> algebra = new ArrayList<Student>();

		System.out.println("Enter the number of students in the class:");
		int num = input.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the name of the student");
			String name = input.nextLine();
			input.nextLine();
			System.out.println("Enter the score of the student");
			int scores = input.nextInt();
			algebra.add(new Student(name, scores));
		}

		for (int i = 0; i < algebra.size(); i++) {
			System.out.println(algebra.get(i).returnName() + algebra.get(i).returnScore());
		}

		int highest = 0;
		int smallest = 999;
		String hname = "";
		String sname = "";
		for (int i = 0; i < algebra.size(); i++) {
			if (algebra.get(i).returnScore() > highest) {
				highest = algebra.get(i).returnScore();
				hname = algebra.get(i).returnName();
			}
			if (algebra.get(i).returnScore() < smallest) {
				smallest = algebra.get(i).returnScore();
				sname = algebra.get(i).returnName();
			}
		}
		System.out.println("Highest score :" + highest);
		System.out.println("Smallest score :" + smallest);

		System.out.println("Enter a name");
		String yName = input.nextLine();
		input.nextLine();
		for (int i = algebra.size() - 1; i >= 0; i--) {
			if (algebra.get(i).returnName() == yName) {
				algebra.remove(i);
			}
		}
		for (int i = 0; i < algebra.size() - 1; i++) {
			System.out.println(algebra.get(i).returnName() + algebra.get(i).returnScore());
		}
	}

}
