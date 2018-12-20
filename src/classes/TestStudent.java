package classes;

public class TestStudent {

	public static void main(String[] args) {
		// int[]sue=new int[4];
		
		Student bob = new Student();
		bob.addaScore("91");
		bob.addaScore("93");
		bob.addaScore("95");
		bob.addaScore("97");
		bob.addaScore("99");
		
		System.out.println("Average: " + bob.averageScore());
		System.out.println("Lowest Score: " + bob.lowestScore());
		System.out.println("State: " + bob.toString());
		Student jim = bob.clone();
		System.out.println("Does Bob have the same score as Jim? " + bob.equals(jim));
	}

}
