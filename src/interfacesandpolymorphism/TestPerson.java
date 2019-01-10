package interfacesandpolymorphism;

import java.util.Scanner;
import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Activity 1
		Person bob = new Teacher();
		System.out.println("Name of the teacher: " + bob.getName());
		System.out.println("Age of the teacher: " + bob.getAge());

		Person smith = new Student();
		System.out.println("Name of the teacher: " + smith.getName());
		System.out.println("Age of the teacher: " + smith.getAge());

		// Activity 2
		Teacher john = new Teacher();
		Student ben = new Student();

		john.setName("John William");
		john.payMe();

		ben.setName("Ben Smith");
		ben.outSick();
		ben.outSick();
		ben.outSick();

		Person newTeacher = john;
		Person newStudent = ben;

		System.out.println("Teacher name: " + newTeacher.getName());
		System.out.println("Teacher age: " + newTeacher.getAge());
		System.out.println("Student name: " + newStudent.getName());
		System.out.println("Student age: " + newStudent.getAge());

		// Activity 3
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Student());
		people.add(new Student());
		people.add(new Student());
		people.add(new Teacher());
		people.add(new Teacher());

		for (Person x : people) {
			String name = x.getName();
			int length = name.length();
			if (length > 10) {
				System.out.println(x.getAge());
			}

		}

		input.close();
	}

}
