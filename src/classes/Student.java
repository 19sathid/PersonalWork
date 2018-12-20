package classes;

public class Student {
	private String name;
	private int[] tests;
	private int howMany;

	public Student() {
		name = "Jim";
		tests = new int[5];
		howMany = 0;
	}

	public Student(String n, int[] x) {
		name = n;
		tests = x;
		howMany = 0;
		for (int i = 0; i < tests.length; i++) {
			if (tests[i] != 0) {
				howMany++;
			}
		}
	}

	public void addaScore(String xScore) {
		int intScore = Integer.parseInt(xScore);
		tests[howMany] = intScore;
		howMany++;
	}

	public double averageScore() {
		double average = 0;
		for (int i = 0; i < howMany; i++) {
			average += tests[i];
		}
		average = average / howMany;
		return average;
	}

	public int lowestScore() {
		int lowest = 10000000;
		for (int i = 0; i < howMany; i++) {
			if (tests[i] < lowest) {
				lowest = tests[i];
			}
		}
		return lowest;
	}

	public String toString() {
		return ("Student name - " + name + ", tests - " + tests[0] + " , " + tests[1] + " , " + tests[2] + " , " + tests[3] + " , " + tests[4] + " , how many - " + howMany);
	}

	public Student clone() {
		return new Student(name, tests);
	}

	public boolean equals(Student user) {
		return (this.toString().equals(user.toString()));
	}
}
