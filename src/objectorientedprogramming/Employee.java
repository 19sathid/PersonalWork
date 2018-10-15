package objectorientedprogramming;

public class Employee {
private double wage;
private int experience;
public Employee()
{
wage = -999.0;
experience = 0;
}
public double getWage(){
	return wage;
}
public void setWage(double newWage){
	newWage = wage*0.1 ;
}
}
