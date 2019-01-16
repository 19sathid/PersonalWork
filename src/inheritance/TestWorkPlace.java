package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class TestWorkPlace {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Employee> workPlace = new ArrayList<Employee>();

		workPlace.add(new Worker("Bob", 16, 3));
		workPlace.add(new Worker("Smith", 18, 4));
		workPlace.add(new Worker("Steve", 20, 5));
		workPlace.add(new Worker("Jones", 22, 6));
		workPlace.add(new Manager("Larry", 25, 3));
		workPlace.add(new Manager("John", 27, 4));
		workPlace.add(new Manager("Peter", 30, 5));
		workPlace.add(new Manager("Danny", 35, 6));
		
		double pay = 0;
		double totalPay = 0;
		int index = 0;
		for(Employee x : workPlace) {
			pay = x.CalculatePay(40);
			totalPay += pay;
			if(x instanceof Worker) {
				System.out.println(x.toString());
			}
			
		}
		System.out.println("Total Pay of all Employees : " + totalPay);
		
	}

}
